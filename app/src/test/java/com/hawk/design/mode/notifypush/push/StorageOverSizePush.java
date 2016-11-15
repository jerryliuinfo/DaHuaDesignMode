package com.hawk.design.mode.notifypush.push;

import com.hawk.design.mode.notifypush.NotifyPusher;

/**
 * Created by lenovo on 2016/11/15.
 * 垃圾超过xxM的push
 */

public class StorageOverSizePush extends NotifyPusher {
    @Override
    public boolean check() {
        System.out.println("StorageOverSizePush check return true");
        return true;
    }

    @Override
    public void show() {
        System.out.println("StorageOverSizePush show");
    }
}
