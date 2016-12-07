package com.hawk.design.mode.notifypush.push;

import android.app.Activity;

import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 16:12
 * @copyright TCL-MIG
 */

public class CommonCondition extends IAction {
    public CommonCondition(Activity context, IAction parent) {
        super(context, parent);
    }

    @Override
    public boolean interrupt() {
        boolean interrupt = false;
        if (interrupt){
            Logger.e(TAG, "CommonCondition  interrupt");
        }

        return interrupt;
    }
}
