package com.hawk.design.mode.sourcedesign.prototype;

import com.hawk.design.mode.util.NLog;

import java.util.ArrayList;

import static com.hawk.design.mode.permission.APermissionGroupAction.TAG;

/**
 * Created by jerryliu on 2017/4/23.
 */

public class WordDocument implements Cloneable{
    public String text;
    public ArrayList<String> mImages = new ArrayList<>();

    public WordDocument(){
        NLog.d(TAG, "WordDocument构造函数");
    }

    @Override
    public WordDocument clone() throws CloneNotSupportedException {
        WordDocument document = (WordDocument) super.clone();
        document.text = this.text;
        document.mImages = (ArrayList<String>) this.mImages.clone();
        return document;
    }

    @Override
    public String toString() {
        return "WordDocument{" + "text='" + text + '\'' + ", mImages=" + mImages + '}';
    }
}
