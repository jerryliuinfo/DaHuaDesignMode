package com.hawk.design.mode.notifypush.manager;

import android.content.Context;
import android.content.SharedPreferences;

import com.hawk.design.mode.MyApplication;
import com.hawk.design.mode.util.BaseSharedPrefConfigManager;

/**
 * Created by lenovo on 2016/11/15.
 */

public class LongTimeNoUsedConfigManager extends BaseSharedPrefConfigManager implements DataControl {
    private static LongTimeNoUsedConfigManager instance = null;
    public static final String NOTIFY_PARAM_CONFIG_SP_NAME = "cloud_contrl_common";
    private SharedPreferences sharedPreference;


    private LongTimeNoUsedConfigManager(){}
    public static LongTimeNoUsedConfigManager getInstance() {
            if (instance == null) {
                synchronized (LongTimeNoUsedConfigManager.class) {
                    if (instance == null){
                        instance = new LongTimeNoUsedConfigManager();
                    }
            }
        }
        return instance;
    }

    @Override
    public long getLastNotifyTime() {
        return getLongValue("last_long_time_no_use", -1) ;
    }

    @Override
    public int getNofifyFrequency() {
        return 48 * 60 *60 *1000;
    }

    //3天
    @Override
    public int getNofifyThresold() {
        return 3;
    }




    @Override
    public SharedPreferences getSharedPreference() {
        if (sharedPreference == null){
            sharedPreference = MyApplication.getInstance().getSharedPreferences(NOTIFY_PARAM_CONFIG_SP_NAME, Context.MODE_PRIVATE);
        }
        return sharedPreference;
    }
}
