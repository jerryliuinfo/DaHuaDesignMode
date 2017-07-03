package com.hawk.design.mode.sourcedesign.srp;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.hawk.design.mode.util.NLog;

import static com.hawk.design.mode.permission.APermissionGroupAction.TAG;

/**
 * Created by jerryliu on 2017/4/23.
 */

public class MemoryCache implements IImageCache {
    private LruCache<String,Bitmap> lruCache;

    public MemoryCache() {
        lruCache = new LruCache<>(100);
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        NLog.d(TAG, "MemoryCache put");
        lruCache.put(url,bitmap);
    }

    @Override
    public Bitmap get(String url) {
        NLog.d(TAG, "MemoryCache get");
        if (lruCache != null){
            return lruCache.get(url);
        }

        return null;

    }





}
