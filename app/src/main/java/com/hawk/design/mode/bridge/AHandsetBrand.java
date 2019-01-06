package com.hawk.design.mode.bridge;

/**
 * Created by Jerry on 2019/1/5.
 * 手机品牌
 */
public abstract class AHandsetBrand {

    protected AHandsetSoft soft;

    public void setSoft(AHandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
