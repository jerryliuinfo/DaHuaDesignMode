package com.hawk.design.mode.notification.bean;

import java.io.Serializable;

/**
 * @author Jerry
 * @Description:
 * @date 2016/8/3 15:09
 * @copyright TCL-MIG
 */

public class NotificationModel implements Serializable {

    public CharSequence mTickerTitle;
    public CharSequence mTitle;
    public CharSequence mContent;
    //public Intent pendingIntent;
    public int mNotifyId; //通知栏id
    public CharSequence mRightButtonText; //通知栏右边按钮的文字
    public int mPendingIntentRequestCode = 0;
    public String mReportMsg; //用于上报
    public String mReportType; //用于上报 用来区分是1.垃圾超过80MB 2.超过5天未清理 3.SD卡空间低于10% 4.内存空间低于10% 5.已超过xx天未使用内存加速
    public String mReportValue; //用于上报


    @Override
    public String toString() {
        return "NotificationModel{" +
                "mTickerTitle=" + mTickerTitle +
                ", mTitle=" + mTitle +
                ", mContent=" + mContent +
                ", mRightButtonText=" + mRightButtonText +
                ", mNotifyId=" + mNotifyId +
                ", mReportType=" + mReportType +
                ", mReportValue=" + mReportValue +
                ", mReportMsg='" + mReportMsg + '\'' +
                '}';
    }
}
