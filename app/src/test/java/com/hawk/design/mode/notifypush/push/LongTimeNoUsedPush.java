package com.hawk.design.mode.notifypush.push;

import com.hawk.design.mode.notifypush.NotifyPusher;

/**
 * Created by lenovo on 2016/11/15.
 * 超过xx天未清理的push
 */

public class LongTimeNoUsedPush extends NotifyPusher {
    @Override
    public boolean check() {
        //今天内是否有弹该通知栏
         //距离上一次通知是否满足了48小时间隔
        //该类(大类，例如 垃圾清理 或者内存加速)今天是否有弹通知栏
        //是否满足了阀值
        System.out.println("LongTimeNoUsedPush check return false");
        return false;
    }

    @Override
    public void show() {
        //1.组装数据
        //2.发送通知
        System.out.println("LongTimeNoUsedPush show");
    }
}
