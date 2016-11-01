package com.hawk.design.mode.proxy;

/**
 * @author Jerry
 * @Description:
 * @date 2016/11/1 20:54
 * @copyright TCL-MIG
 */

public class Pursuit implements GiveGift {
    SchoolGirl girl;

    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {

    }

    @Override
    public void giveFlowers() {

    }

    @Override
    public void giveChocolate() {

    }
}
