package com.hawk.design.mode;

import android.app.Application;

/**
 * @author Jerry
 * @Description:
 * @date 2016/11/16 10:39
 * @copyright TCL-MIG
 */

public class MyApplication extends Application {
    private static MyApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static MyApplication getInstance(){
        return instance;
    }
}
