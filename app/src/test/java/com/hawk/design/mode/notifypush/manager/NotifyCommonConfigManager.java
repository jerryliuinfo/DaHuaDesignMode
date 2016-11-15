package com.hawk.design.mode.notifypush.manager;

/**
 * Created by lenovo on 2016/11/15.
 * 通知栏通用数据管理 例如最后一次通知的时间， 每一大类(垃圾或者内存加速)的通知时间
 */

public class NotifyCommonConfigManager {
    private static NotifyCommonConfigManager instance = null;
    private NotifyCommonConfigManager(){}
    public static NotifyCommonConfigManager getInstance() {
            if (instance == null) {
                synchronized (NotifyCommonConfigManager.class) {
                    if (instance == null){
                        instance = new NotifyCommonConfigManager();
                    }
            }
        }
        return instance;
    }
    public int getTodayJunkPushCount(){
        return 0;
    }

    public int getTodayBoostPushCount(){
        return 0;
    }

}
