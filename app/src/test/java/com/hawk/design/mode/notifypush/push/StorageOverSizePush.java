package com.hawk.design.mode.notifypush.push;

import com.hawk.design.mode.notifypush.NotifyPusher;
import com.hawk.design.mode.notifypush.TimeUtil;
import com.hawk.design.mode.notifypush.manager.NotifyCommonConfigManager;
import com.hawk.design.mode.notifypush.manager.StorageOverSizeManager;

/**
 * Created by lenovo on 2016/11/15.
 * 垃圾超过xxM的push
 */

public class StorageOverSizePush extends NotifyPusher {
    @Override
    public boolean check() {
        //1.今天内是否有弹该通知栏
        StorageOverSizeManager configManager = StorageOverSizeManager.getInstance();
        long lastNotifyTime = configManager.getLastNotifyTime();
        if (lastNotifyTime > TimeUtil.getTodayBeginMilles() && lastNotifyTime < TimeUtil.getTodayEndMilles() ){
            return false;
        }
        //2.距离上一次通知是否满足了48小时间隔
        long currentTimeMilles = System.currentTimeMillis();
        //System.currentTimeMilles - lastNotifyTime <= server interval
        if (currentTimeMilles - lastNotifyTime <= configManager.getNofifyFrequency()){
            return false;
        }

        //3.该类(大类，例如 垃圾清理 或者内存加速)今天是否有弹通知栏
        if (NotifyCommonConfigManager.getInstance().getTodayBoostPushCount() >= 1){
            return false;
        }
        //4.是否满足了阀值
        int usedSize = 800;
        if (usedSize < configManager.getNofifyThresold()){
            return false;
        }
        System.out.println("StorageOverSizePush check return false");
        return true;
    }

    @Override
    public void show() {
        System.out.println("StorageOverSizePush show");
    }
}
