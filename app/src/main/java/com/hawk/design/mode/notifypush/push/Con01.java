package com.hawk.design.mode.notifypush.push;

import android.app.Activity;

import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 11:04
 * @copyright TCL-MIG
 */

public class Con01 extends AConditionAction {

    public Con01(IAction parent) {
        super(parent);
    }

    @Override
    public boolean checkCondition() {
        boolean interrupt = true;
        if (interrupt) {
            NLog.e(TAG,"Con01 interupt------");
        }else {
            NLog.d(TAG,"Con01 not interupt" );
        }
        return interrupt;
    }

}
