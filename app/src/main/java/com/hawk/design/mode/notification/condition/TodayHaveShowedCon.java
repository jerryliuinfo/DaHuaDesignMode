package com.hawk.design.mode.notification.condition;

import com.hawk.design.mode.notification.NotifyCommonConfigManager;
import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 18:50
 * @copyright TCL-MIG
 */

public class TodayHaveShowedCon extends AConditionAction {

    private final String keyTime;

    public TodayHaveShowedCon(IAction parent, String keyTime) {
        super(parent);
        this.keyTime = keyTime;
    }

    @Override
    public boolean checkCondition() {
        return isTodayShowed();
    }

    private boolean isTodayShowed() {
        // TODO 根据这个KEY获取时间，用时间判断是否是当天
        long lastUse = NotifyCommonConfigManager.getInstance().getLongValue(keyTime, -1);
        boolean interupt = false;
        /*if (lastUse > TimeStrUtil.getTimesmorning() && lastUse < TimeStrUtil.getTimesnight() ){
            Logger.e(TAG, "TodayHaveShowedCon interupt");
            interupt =  true;
        }*/
        return interupt;
    }

    final public void setLastNotifyTime(long value) {
        NotifyCommonConfigManager.getInstance().setLongValue(keyTime, value);
    }




}
