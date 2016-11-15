package com.hawk.design.mode.notifypush.manager;

/**
 * Created by lenovo on 2016/11/15.
 */

public class LongTimeNoUsedConfigManager implements DataControl {
    private static LongTimeNoUsedConfigManager instance = null;
    private LongTimeNoUsedConfigManager(){}
    public static LongTimeNoUsedConfigManager getInstance() {
            if (instance == null) {
                synchronized (LongTimeNoUsedConfigManager.class) {
                    if (instance == null){
                        instance = new LongTimeNoUsedConfigManager();
                    }
            }
        }
        return instance;
    }

    @Override
    public long getLastNotifyTime() {
        return System.currentTimeMillis() ;
    }

    @Override
    public int getNofifyFrequency() {
        return 48 * 60 *60 *1000;
    }

    //3天
    @Override
    public int getNofifyThresold() {
        return 3;
    }
}
