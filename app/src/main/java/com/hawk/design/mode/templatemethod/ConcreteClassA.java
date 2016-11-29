package com.hawk.design.mode.templatemethod;

/**
 * Created by lenovo on 2016/11/6.
 */

public class ConcreteClassA extends Template {
    @Override
    public void step2() {
        System.out.println("ConcreteClassA step2");
    }

    @Override
    public void step3() {
        System.out.println("ConcreteClassA step3");
    }
}
