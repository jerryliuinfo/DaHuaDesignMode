package com.hawk.design.mode.notifypush;

/**
 * Created by lenovo on 2016/11/15.
 * 通知栏push基类
 */

public abstract class NotifyPusher implements NotifyControl{
    NotifyPusher parent;

    public void setParent(NotifyPusher parent) {
        this.parent = parent;
    }
    public void dealRequest(){
        //先检查公共条件
        if (!NotifyHelper.checkCommonCondition()){
            return;
        }
        //检查每个通知栏自己的条件(不包括公共条件,各个通知栏条件自己实现自己的弹出条件，互不干扰，达到解耦目的)
        //如果不满足自身条件， 则调用parent的dealRequest
        if (check()){
            show();
        }
        else if (parent != null){
            parent.dealRequest();
        }
    }
}
