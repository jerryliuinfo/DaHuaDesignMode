package com.hawk.design.mode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hawk.design.mode.notification.junk.overday.JunkLongTimeUnusedPush;
import com.hawk.design.mode.notification.junk.oversize.JunkOverSizePush;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.NLog;

/**
 * @author Jerry
 * @Description:
 * @date 2016/9/10 11:08
 * @copyright TCL-MIG
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testNotifyPush();
    }

    public void testNotifyPush() {
        //junkOverSizePush.run();
        for (int i = 0 ; i < 100; i++){
            synchronized (this){
             /*   Con01 con01 = new Con01(null, null);// 中断条件
                Con02 con02 = new Con02(null, null);// 不中断条件
                Con03 con03 = new Con03(null, con02);// 随机中断
                Con04 con04 = new Con04(null, con03);// 随机中断*/

//                RamUnsufficientPush ramUnsufficientPush =  RamUnsufficientPush.newInstace(null);
                JunkOverSizePush junkOverSizePush = JunkOverSizePush.newInstace(null);
                JunkLongTimeUnusedPush junkLongTimeNoUsedPush = JunkLongTimeUnusedPush.newInstace(junkOverSizePush);
                junkLongTimeNoUsedPush.run();
                NLog.d(IAction.TAG,"------------------------------------------------------>");
            }
        }
    }
}
