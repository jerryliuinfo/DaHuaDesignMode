package com.hawk.design.mode.setting;

import android.text.TextUtils;

import com.hawk.design.mode.util.StringUtils;

import java.util.HashMap;

/**
 * @author Jerry
 * @Description:云端数据拉取下来的map，用来给app上层提供数据源
 * @date 2016/10/27 16:49
 * @copyright TCL-MIG
 */

public class DataSource {

    //存放从服务器拉取下来的所有数据
    public static HashMap<String,String> dataMap = new HashMap<>();

    public static HashMap<String,String> getDataMap(){
        return dataMap;
    }


    public static long getLong(String key){
        return getLong(key, -1);
    }

    public static long getLong(String key, long defValue){
        return StringUtils.toLong(dataMap.get(key), defValue);
    }

    public static String getString(String key){
        return getString(key, "");
    }
    public static String getString(String key, String defValue){
        if (!TextUtils.isEmpty(key)){
            return dataMap.get(key);
        }
        return defValue;

    }

    public static boolean getBoolean(String key){
        return StringUtils.toBoolean(dataMap.get(key));
    }

    public static boolean getBoolean(String key, boolean defValue){
        return StringUtils.toBoolean(dataMap.get(key), defValue);
    }
}
