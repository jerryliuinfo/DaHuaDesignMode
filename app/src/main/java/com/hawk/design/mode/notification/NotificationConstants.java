package com.hawk.design.mode.notification;

/**
 * @author Jerry
 * @Description:
 * @date 2016/8/3 11:03
 * @copyright TCL-MIG
 */

public class NotificationConstants {
    public static final int JUNK_CLEAN_OVER_DAY_NOTIFY = 11; //已经超过xx天没有清理垃圾
    public static final int JUNK_OVER_SIZE_NOTIFY = 12; //垃圾超过xxM未清理
    public static final int AVAIBLE_SPACE_NOTIFY_SD = 13; //SD剩余空间不足xx%
    public static final int AVAIBLE_SPACE_NOTIFY_RAM = 14; //RAM剩余空间不足20%
    public static final int OVER_DAY_NO_USED_NOTIFY_RAM = 15; //用户3天没有进行手机加速的操作，且占用的内存空间超过20%时
    public static final int OVER_DAY_NO_USED_NOTIFY_APPMGT = 16; //XX款应用超过7天未使用

    //1天的ms数
    public final static int ONE_DAY_MILLES = 86400000;  //24 * 60 * 60 * 1000;
    //1分钟ms数
    public final static int ONE_MINUTE_MILLES =  60000; //1 * 60 * 1000;
    //1小时ms数
    public final static int ONE_HOUR_MILLES =  3600000; //60 * 60 * 1000;


}
