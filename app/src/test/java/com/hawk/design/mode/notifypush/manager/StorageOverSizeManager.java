package com.hawk.design.mode.notifypush.manager;

/**
 * Created by lenovo on 2016/11/15.
 */

public class StorageOverSizeManager implements DataControl {
    private static StorageOverSizeManager instance = null;
    private StorageOverSizeManager(){}
    public static StorageOverSizeManager getInstance() {
            if (instance == null) {
                synchronized (StorageOverSizeManager.class) {
                    if (instance == null){
                        instance = new StorageOverSizeManager();
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

    //500
    @Override
    public int getNofifyThresold() {
        return 500;
    }
}
