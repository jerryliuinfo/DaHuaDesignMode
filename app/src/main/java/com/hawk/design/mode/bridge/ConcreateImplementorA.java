package com.hawk.design.mode.bridge;

/**
 * Created by Jerry on 2019/1/6.
 */
public class ConcreateImplementorA extends AImplementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
