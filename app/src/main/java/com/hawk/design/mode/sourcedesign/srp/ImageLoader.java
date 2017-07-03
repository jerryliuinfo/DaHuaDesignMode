package com.hawk.design.mode.sourcedesign.srp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import com.hawk.design.mode.MyApplication;
import com.hawk.design.mode.R;
import com.hawk.design.mode.sourcedesign.builder.ImageLoadConfig;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jerryliu on 2017/4/23.
 */

public class ImageLoader {
    private IImageCache iImageCache;
    private ExecutorService executorService = Executors.newFixedThreadPool(20);
    private ImageLoadConfig imageLoadConfig;


    private static ImageLoader instance = null;
    private ImageLoader(){
        iImageCache = new MemoryCache();
    }
    public static ImageLoader getInstance() {
            if (instance == null) {
                synchronized (ImageLoader.class) {
                    if (instance == null){
                        instance = new ImageLoader();
                    }
            }
        }
        return instance;
    }
    public void init(ImageLoadConfig config){
        this.imageLoadConfig = config;
    }



    public void displayImage(ImageView imageView, String url){
       /* if (imageView == null || TextUtils.isEmpty(url)){
            return;
        }*/
        Bitmap bitmap = iImageCache.get(url);
        if (bitmap != null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        submitLoadImageRequest(url);

    }

    private void submitLoadImageRequest(final String url){
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadBitmap();
                if (bitmap == null){
                    return;
                }
                iImageCache.put(url,bitmap);
            }
        });
    }


    public void setImageCache(IImageCache imageCache) {
        this.iImageCache = imageCache;
    }

    private Bitmap downloadBitmap(){
        return BitmapFactory.decodeResource(MyApplication.getContext().getResources(), R.mipmap.ic_launcher);
    }
}
