package com.hawk.design.mode.notifypush.push;

import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 11:04
 * @copyright TCL-MIG
 */

public class Con02 extends AConditionAction {

    public Con02(IAction parent) {
        super(parent);
    }

    @Override
    public boolean checkCondition() {
        boolean interrupt = false;
        if (interrupt) {
            Logger.e(TAG,"Con02 interupt------");
        }else {
            Logger.d(TAG,"Con02 not interupt" );
        }
        return interrupt;
    }
}
