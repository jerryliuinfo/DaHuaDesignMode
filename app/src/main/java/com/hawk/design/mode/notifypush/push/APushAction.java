package com.hawk.design.mode.notifypush.push;

import android.app.Activity;

import com.hawk.design.mode.permission.IAction;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 10:54
 * @copyright TCL-MIG
 */

public abstract class APushAction extends IAction {

    private IAction conditionAction;

    public APushAction(Activity context, IAction parentPush, IAction conditionAction) {
        super(context, parentPush);
        this.conditionAction = conditionAction;
    }

    // 自身条件是符合的，可以弹出自己的Push
    @Override
    final public boolean interrupt() {
        //高优先级的通知栏拦截了
        if (getParent() != null && getParent().interrupt()) {
            return true;
        }
        if (conditionAction == null || !conditionAction.interrupt()) {
            doInterrupt();
            return true;
        }
        return false;
    }
    @Override
    final public void doInterrupt() {
        doAction();
    }
    @Override
    final public void run() {
        boolean runAble = false;
        // 父Push没有弹出通知
        if (getParent() == null || !getParent().interrupt()) {
            runAble = true;
        }
        if (runAble) {
            runAble = false;
            // 自己的条件是否符合
            if (conditionAction == null || !conditionAction.interrupt()) {
                runAble = true;
            }
        }
        if (runAble) {
            doAction();
        }
    }

    @Override
    final public void doAction() {
         runNotify();
    }

    // TODO 弹出通知
    public abstract void runNotify();

}
