package com.hawk.design.mode.notifypush.push;

import com.hawk.design.mode.notifypush.NotificationConstans;
import com.hawk.design.mode.notifypush.TimeUtil;
import com.hawk.design.mode.notifypush.manager.LongTimeNoUsedConfigManager;
import com.hawk.design.mode.notifypush.NotifyPusher;
import com.hawk.design.mode.notifypush.manager.NotifyCommonConfigManager;

/**
 * Created by lenovo on 2016/11/15.
 * 超过xx天未清理的push
 */

public class LongTimeNoUsedPush extends NotifyPusher {
    @Override
    public boolean check() {
        //1.今天内是否有弹该通知栏
        LongTimeNoUsedConfigManager configManager = LongTimeNoUsedConfigManager.getInstance();
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
        if (NotifyCommonConfigManager.getInstance().getTodayJunkPushCount() >= 1){
            return false;
        }
        //4.是否满足了阀值
        if (currentTimeMilles - lastNotifyTime < NotificationConstans.ONE_DAY_MILLES){
            return false;
        }
        System.out.println("LongTimeNoUsedPush check return false");
        return false;
    }

    @Override
    public void show() {
        //1.组装数据
        //2.发送通知
        System.out.println("LongTimeNoUsedPush show");
    }
}
