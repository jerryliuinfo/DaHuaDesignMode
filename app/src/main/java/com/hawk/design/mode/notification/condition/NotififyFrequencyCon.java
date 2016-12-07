package com.hawk.design.mode.notification.condition;

import com.hawk.design.mode.notification.NotificationConstants;
import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 17:15
 * @copyright TCL-MIG
 */

public  class NotififyFrequencyCon extends AConditionAction {
    private final String key;
    public static final String TYPE_JUNK_OVER_DAY = "junk_over_day";
    public static final String TYPE_JUNK_OVER_SIZE = "junk_over_size";
    public static final String TYPE_JUNK_STORAGE_UNSUFFICIENT = "junk_storage_unsufficient";
    public static final String TYPE_BOOST_OVER_DAY = "BOOST_OVER_DAY";
    public static final String TYPE_BOOST_UNSUFFICIENT = "boost_unsufficient";
    public static final String TYPE_APPMGT_OVER_DAY = "appmgt_over_day";

    public NotififyFrequencyCon(IAction parent, String key) {
        super(parent);
        this.key = key;
    }

    @Override
    public boolean checkCondition() {
        long lastNotifyTime = System.currentTimeMillis();
        long interval = 0;
        if (TYPE_JUNK_OVER_DAY.equals(key)) {
            lastNotifyTime = 0;
            interval = 0;
        }else if (TYPE_JUNK_OVER_SIZE.equals(key)){
            lastNotifyTime = 0;
            interval = 0;
        }else if (TYPE_JUNK_STORAGE_UNSUFFICIENT.equals(key)){
            lastNotifyTime = 0;
            interval = 0;
        }else if (TYPE_BOOST_OVER_DAY.equals(key)){
            lastNotifyTime = 0;
            interval = 0;
        }
        return haveAlreadyNotifiedIn48Hours(lastNotifyTime,interval);
    }


    /**
     * 是否在48小时内弹过此类通知栏
     * @param lastNotify
     * @param serverInterval:服务器定义的间隔为分钟， 这里单位转换为ms
     * @return
     */
    public  boolean haveAlreadyNotifiedIn48Hours(long lastNotify, long serverInterval){
        //for test
        Logger.d(TAG, "haveAlreadyNotifiedIn48Hours interval = %d 小时, server interval = %d 小时", ((System.currentTimeMillis() - lastNotify) / NotificationConstants.ONE_HOUR_MILLES), serverInterval / NotificationConstants.ONE_HOUR_MILLES);
        // 距离上一次间隔在48小时内
        if (System.currentTimeMillis() - lastNotify < serverInterval ) {
            Logger.d(TAG, "距离上一次通知此类通知间隔不足 %d 小时, do not notify",  serverInterval / NotificationConstants.ONE_HOUR_MILLES);
            return true;
        }
        Logger.d(TAG, "距离上一次通知此类通知间隔超过 %d 小时, do  notify",  serverInterval / NotificationConstants.ONE_HOUR_MILLES);
        return false;
    }


}
