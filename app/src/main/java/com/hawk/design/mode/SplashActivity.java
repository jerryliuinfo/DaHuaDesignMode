package com.hawk.design.mode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hawk.design.mode.notification.boost.unsufficient.RamUnsufficientPush;
import com.hawk.design.mode.notification.junk.overday.JunkLongTimeUnusedPush;
import com.hawk.design.mode.notification.junk.oversize.JunkOverSizePush;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.sourcedesign.builder.ImageLoadConfig;
import com.hawk.design.mode.sourcedesign.srp.DoubleCache;
import com.hawk.design.mode.sourcedesign.srp.ImageLoader;
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
        Button btn_test = (Button) findViewById(R.id.btn_test);
        final ImageView imageView = (ImageView) findViewById(R.id.imageview);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageLoadConfig config = new ImageLoadConfig.Builder().setLoadFailedRes(R.mipmap.ic_launcher).create();
                ImageLoader imageLoader = ImageLoader.getInstance();
                imageLoader.init(config);
                imageLoader.setImageCache(new DoubleCache());
                imageLoader.displayImage(imageView,"www.baidu.com");
            }
        });

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

                RamUnsufficientPush ramUnsufficientPush =  RamUnsufficientPush.newInstace(null);
                JunkOverSizePush junkOverSizePush = JunkOverSizePush.newInstace(ramUnsufficientPush);
                JunkLongTimeUnusedPush junkLongTimeNoUsedPush = JunkLongTimeUnusedPush.newInstace(junkOverSizePush);
                junkLongTimeNoUsedPush.run();
                NLog.d(IAction.TAG,"------------------------------------------------------>");
            }
        }
    }
}
