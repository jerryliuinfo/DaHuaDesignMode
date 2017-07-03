package com.hawk.design.mode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jerryliu on 2017/7/3.
 */

public class ProxyHandler implements InvocationHandler {
    private Object proxied;

    public ProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在转调具体目标对象之前，可以执行一些功能处理
        System.out.println("before");
        //转调具体目标对象的方法
        Object result = method.invoke( proxied, args);
        String methodName = method.getName();
        if (methodName.contains("doSomething2")){
            System.out.println("记录日志");
        }
        //在转调具体目标对象之后，可以执行一些功能处理
        System.out.println("after");
        return result;
    }
}
