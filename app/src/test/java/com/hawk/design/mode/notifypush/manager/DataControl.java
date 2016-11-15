package com.hawk.design.mode.notifypush.manager;

/**
 * Created by lenovo on 2016/11/15.
 */

public interface DataControl {
    //最后一次通知时间
    long getLastNotifyTime();
    //通知频率
    int getNofifyFrequency();
    //通知阀值， 例如是否超过了xx天未清理， 垃圾超过xxM，
    int getNofifyThresold();

}
