package com.hawk.design.mode.notifypush.push;

import com.hawk.design.mode.notifypush.NotifyPusher;

/**
 * Created by lenovo on 2016/11/15.
 * 内存空间不足xx%的通知
 */

public class RamInsufficientPush extends NotifyPusher {
    @Override
    public boolean check() {
        return true;
    }

    @Override
    public void show() {

    }
}
