package com.hawk.design.mode.proxy;

/**
 * @author Jerry
 * @Description:
 * @date 2016/11/1 20:54
 * @copyright TCL-MIG
 */

public class Pursuit implements IGiveGift {
    SchoolGirl girl;

    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.name +"送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.name +"送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.name +"送你巧克力");
    }
}
