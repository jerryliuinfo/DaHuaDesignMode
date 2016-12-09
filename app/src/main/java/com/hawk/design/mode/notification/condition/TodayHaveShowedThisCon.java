package com.hawk.design.mode.notification.condition;

import com.hawk.design.mode.notification.NotifyCommonConfigManager;
import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.NLog;

/**
 * @author Jerry
 * @Description:今天是否有弹过这个通知
 * @date 2016/12/7 18:50
 * @copyright TCL-MIG
 */

public class TodayHaveShowedThisCon extends AConditionAction {

    private final String keyTime;

    public TodayHaveShowedThisCon(IAction parent, String keyTime) {
        super(parent);
        this.keyTime = keyTime;
    }

    @Override
    public boolean checkCondition() {
        NLog.d(TAG, "TodayHaveShowedThisCon checkCondition");
        return isTodayShowed();
    }

    private boolean isTodayShowed() {
        // TODO 根据这个KEY获取时间，用时间判断是否是当天
        long lastUse = NotifyCommonConfigManager.getInstance().getLongValue(keyTime, -1);
        boolean interupt = false;
        /*if (lastUse > TimeStrUtil.getTimesmorning() && lastUse < TimeStrUtil.getTimesnight() ){
            NLog.e(TAG, "TodayHaveShowedThisCon interupt");
            interupt =  true;
        }*/
        return interupt;
    }

    final public void updateLastNotifyTime() {
        NotifyCommonConfigManager.getInstance().setLongValue(keyTime, System.currentTimeMillis());
    }




}
