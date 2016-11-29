package com.hawk.design.mode;

import android.app.Application;

/**
 * @author Jerry
 * @Description:
 * @date 2016/11/29 10:07
 * @copyright TCL-MIG
 */

public class MyApplication extends Application {
    private static MyApplication context;
    private static MyApplication application;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        application = this;
    }

    public static MyApplication getContext() {
        return context;
    }

    public static MyApplication getApplication() {
        return application;
    }
}
