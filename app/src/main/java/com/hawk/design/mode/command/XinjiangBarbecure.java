package com.hawk.design.mode.command;

/**
 * Created by jerryliu on 2017/8/29.
 */

public class XinjiangBarbecure implements IBarbecure {
    @Override
    public void bakeMutton() {
        System.out.println("新疆烤羊肉");
    }

    @Override
    public void bakeChickenWing() {
        System.out.println("新疆烤鸡翅");

    }
}
