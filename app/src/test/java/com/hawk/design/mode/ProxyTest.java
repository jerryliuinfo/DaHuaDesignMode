package com.hawk.design.mode;

import com.hawk.design.mode.proxy.RealSubject;
import com.hawk.design.mode.proxy.Subject;
import com.hawk.design.mode.proxy.Subject2;
import com.hawk.design.mode.proxy.dynamic.ProxyHandler;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author Jerry
 * @Description:
 * @date 2016/11/1 20:57
 * @copyright TCL-MIG
 */

public class ProxyTest {
    @Test
    public void testProxyMode() throws Exception {
        /*SchoolGirl girl = new SchoolGirl("Lucy");
        MyProxy proxy = new MyProxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();


        ProxySubject proxySubject = new ProxySubject();
        proxySubject.request();*/

        RealSubject realSubject = new RealSubject();
        /*Subject proxySubject = (Subject) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),new Class[]{Subject.class},new ProxyHandler(realSubject));
        proxySubject.doSomething();*/

        Subject proxySubject = (Subject) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), new Class[]{Subject.class, Subject2.class}, new ProxyHandler(realSubject) );
        proxySubject.doSomething();

        ((Subject2) proxySubject).doSomething2();

    }
}
