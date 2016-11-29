package com.hawk.design.mode.notifypush;

/**
 * Created by lenovo on 2016/11/15.
 */

public interface NotifyControl {
    //检查是否允许弹通知栏
    boolean check();
    //显示通知栏
    void show();
}
