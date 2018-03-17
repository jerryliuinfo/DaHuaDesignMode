package com.hawk.design.mode.visitor;

/**
 * Created by 01370340 on 2017/10/29.
 */

public class Success extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人"+getStates() +" 时，背后多有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人"+getStates() +" 时，背后多有一个不成功的男人");
    }

    @Override
    public String getStates() {
        return "成功";
    }
}
