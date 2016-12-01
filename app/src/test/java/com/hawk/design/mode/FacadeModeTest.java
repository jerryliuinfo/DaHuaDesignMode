package com.hawk.design.mode;

import com.hawk.design.mode.facade.Facade;

import org.junit.Test;

/**
 * Created by lenovo on 2016/12/1.
 */

public class FacadeModeTest {
    @Test
    public void TestFacadeMode() throws Exception {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
