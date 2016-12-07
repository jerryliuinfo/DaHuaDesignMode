package com.hawk.design.mode.notification;

import android.content.Context;
import android.content.SharedPreferences;

import com.hawk.design.mode.MyApplication;
import com.hawk.design.mode.util.BaseSharedPrefConfigManager;

import static com.hawk.design.mode.util.NotifyConfigManager.NOTIFY_PARAM_CONFIG_SP_NAME;

/**
 * Created by lenovo on 2016/11/15.
 * 通知栏通用数据管理 例如最后一次通知的时间， 每一大类(垃圾或者内存加速)的通知时间
 */

public class NotifyCommonConfigManager extends BaseSharedPrefConfigManager{
    private static NotifyCommonConfigManager instance = null;
    private NotifyCommonConfigManager(){}
    public static NotifyCommonConfigManager getInstance() {
            if (instance == null) {
                synchronized (NotifyCommonConfigManager.class) {
                    if (instance == null){
                        instance = new NotifyCommonConfigManager();
                    }
            }
        }
        return instance;
    }

    private SharedPreferences sharedPreference;
    @Override
    public SharedPreferences getSharedPreference() {
        if (sharedPreference == null){
            sharedPreference = MyApplication.getContext().getSharedPreferences(NOTIFY_PARAM_CONFIG_SP_NAME, Context.MODE_PRIVATE);
        }
        return sharedPreference;
    }
}
