package com.hawk.design.mode;


import com.hawk.design.mode.prototype.Resume;

import org.junit.Test;

/**
 * 原型模式测试
 * Created by lenovo on 2016/11/2.
 */

public class ProtitypeModeTest {
    @Test
    public void testPrototypeMode() throws Exception {
        Resume resumeA = new Resume("张三");
        resumeA.setPersonalInfo("25", "男");
        resumeA.setWorkExperience("2013-2015", "Google公司");

        Resume resumeB = resumeA.cloneResume();
        resumeB.setWorkExperience("2011-2013", "Microsoft公司");

        Resume resumeC = resumeA.cloneResume();
        resumeC.setWorkExperience("2009-2011", "Apple公司");

        resumeA.display();
        resumeB.display();
        resumeC.display();
    }
}
