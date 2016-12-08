package com.hawk.design.mode.notification;

import com.hawk.design.mode.notification.bean.NotificationModel;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/8 10:17
 * @copyright TCL-MIG
 */

public class NotificationManagerWrapper {
    private static NotificationManagerWrapper instance = null;
    private NotificationManagerWrapper(){}
    public static NotificationManagerWrapper getInstance() {
            if (instance == null) {
                synchronized (NotificationManagerWrapper.class) {
                    if (instance == null){
                        instance = new NotificationManagerWrapper();
                    }
            }
        }
        return instance;
    }
    public  synchronized boolean sendNotification(NotificationModel model){
        if (model == null){
            return false;
        }
        return true;
    }


}
