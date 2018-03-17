package com.hawk.design.mode.visitor;

/**
 * Created by 01370340 on 2017/10/29.
 */

public abstract class Person {

    public abstract void accept(Action visitor);
}
