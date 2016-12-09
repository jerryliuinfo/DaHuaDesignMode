package com.hawk.design.mode;

import android.app.Application;

import com.hawk.design.mode.util.Logger;
import com.hawk.design.mode.util.NLog;

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
        NLog.setDebug(true, Logger.DEBUG);
    }

    public static MyApplication getContext() {
        return context;
    }

    public static MyApplication getApplication() {
        return application;
    }
}
