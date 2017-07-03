package com.hawk.design.mode.proxy;

/**
 * Created by lenovo on 2016/11/1.
 */

public class ProxySubject implements Subject {
    RealSubject realSubject;
    public ProxySubject() {
        realSubject = new RealSubject();
    }


    @Override
    public void doSomething() {
        if (realSubject != null){
            realSubject.doSomething();
        }
    }

}
