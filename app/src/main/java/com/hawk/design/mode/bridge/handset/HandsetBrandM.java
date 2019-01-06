package com.hawk.design.mode.bridge.handset;

/**
 * Created by Jerry on 2019/1/5.
 */
public class HandsetBrandM extends AHandsetBrand {
    public HandsetBrandM() {
    }

    @Override
    public void run() {
        System.out.println("HandsetBrandM ");
        soft.run();
    }
}
