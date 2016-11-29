package com.hawk.design.mode.proxy;

/**
 * Created by lenovo on 2016/11/1.
 */

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject  request");
    }
}
