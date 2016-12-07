package com.hawk.design.mode.notifypush.push;

import com.hawk.design.mode.permission.IAction;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 11:31
 * @copyright TCL-MIG
 */

public abstract class AConditionAction extends IAction {

    public AConditionAction(IAction parent) {
        super(null, parent);
    }

    @Override
    final public void doInterrupt() {
        super.doInterrupt();
    }

    @Override
    final public void run() {
        super.run();
    }


    @Override
    final public boolean interrupt() {
        if (getParent() != null && getParent().interrupt()) {
            return true;
        }
        return checkCondition();
    }

    // TODO 判断自己的条件，不符合，就返回True
    abstract public boolean checkCondition();

}
