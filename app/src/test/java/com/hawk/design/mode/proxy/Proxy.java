package com.hawk.design.mode.proxy;

/**
 * @author Jerry
 * @Description:
 * @date 2016/11/1 20:54
 * @copyright TCL-MIG
 */

public class Proxy implements GiveGift {
    public Pursuit pursuit;

    public Proxy(SchoolGirl girl) {
        pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        if (pursuit != null){
            pursuit.giveDolls();
        }
    }

    @Override
    public void giveFlowers() {
        if (pursuit != null){
            pursuit.giveFlowers();
        }
    }

    @Override
    public void giveChocolate() {
        if (pursuit != null){
            pursuit.giveChocolate();
        }
    }
}
