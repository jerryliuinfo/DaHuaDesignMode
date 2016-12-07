package com.hawk.design.mode;

import com.hawk.design.mode.notification.junk.overday.JunkLongTimeUnusedPush;
import com.hawk.design.mode.notifypush.push.Con01;
import com.hawk.design.mode.notifypush.push.Con02;
import com.hawk.design.mode.notifypush.push.Con03;
import com.hawk.design.mode.notifypush.push.Con04;

import org.junit.Test;

/**
 * Created by lenovo on 2016/11/13.
 */

public class NotifyPushTest {
    @Test
    public void testNotifyPush() throws Exception {


        //junkOverSizePush.run();
        for (int i = 0 ; i < 2; i++){
            synchronized (this){
                Con01 con01 = new Con01(null);// 中断条件
                Con02 con02 = new Con02(null);// 不中断条件
                Con03 con03 = new Con03(con02);// 随机中断
                Con04 con04 = new Con04(con03);// 随机中断
                JunkLongTimeUnusedPush junkLongTimeNoUsedPush = JunkLongTimeUnusedPush.newInstace(null);
                junkLongTimeNoUsedPush.run();
                System.out.println("------------------------------------------------------>");
            }
        }
    }
}
