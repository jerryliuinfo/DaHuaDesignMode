package com.hawk.design.mode.notification;

import com.hawk.design.mode.util.Logger;

import static com.hawk.design.mode.permission.APermissionGroupAction.TAG;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 17:26
 * @copyright TCL-MIG
 */

public class NotifyHelper {
    /**
     * 是否在48小时内弹过此类通知栏
     * @param lastNotify
     * @param serverInterval:服务器定义的间隔为分钟， 这里单位转换为ms
     * @return
     */
    public static boolean haveAlreadyNotifiedIn48Hours(long lastNotify, long serverInterval){
        //for test

        // 距离上一次间隔在48小时内
        if (System.currentTimeMillis() - lastNotify < serverInterval ) {
            Logger.d(TAG, "距离上一次通知此类通知间隔不足 %d 小时, do not notify",  serverInterval / NotificationConstants.ONE_HOUR_MILLES);
            return true;
        }
//        else {
//            NLog.d(TAG, "notified in  48 hours from the last notify time, do not notify");
//            result = true;
//        }
        Logger.d(TAG, "距离上一次通知此类通知间隔超过 %d 小时, do  notify",  serverInterval / NotificationConstants.ONE_HOUR_MILLES);
        return false;
    }
}
