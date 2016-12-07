package com.hawk.design.mode.notification.condition.common;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 17:28
 * @copyright TCL-MIG
 */

public class Over2HoursCon extends AConditionAction {
    public Over2HoursCon(IAction parent) {
        super(parent);
    }

    @Override
    public boolean checkCondition() {
        Logger.d(TAG, "Over2HoursCon checkCondition");
        boolean result = false;
        if (result){
            Logger.e(TAG, "Over2HoursCon interrupted");
        }
        return result;
    }
}
