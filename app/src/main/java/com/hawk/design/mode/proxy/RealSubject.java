package com.hawk.design.mode.proxy;

/**
 * Created by lenovo on 2016/11/1.
 */

public class RealSubject implements Subject,Subject2 {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }

    @Override
    public void doSomething2() {
        System.out.println("do doSomething2");
    }
}
