package com.hawk.design.mode;

import com.hawk.design.mode.sourcedesign.prototype.WordDocument;

import org.junit.Test;

/**
 * Created by jerryliu on 2017/4/23.
 */

public class CloneTest {
    public static final String TAG = CloneTest.class.getSimpleName();
    @Test
    public void testClone() throws Exception{
        WordDocument orginal = new WordDocument();
        orginal.text = "haha";



        WordDocument cloneDocument =  orginal.clone();
        cloneDocument.text = "hehe";
        cloneDocument.mImages.add("aaa");
        System.out.println("testClone orginal = "+ orginal +"clone = "+cloneDocument);
    }
}
