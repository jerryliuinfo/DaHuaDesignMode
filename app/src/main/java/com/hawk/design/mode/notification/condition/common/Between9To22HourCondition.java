package com.hawk.design.mode.notification.condition.common;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 19:38
 * @copyright TCL-MIG
 */

public class Between9To22HourCondition extends AConditionAction {
    public Between9To22HourCondition(IAction parent) {
        super(parent);
    }

    @Override
    public boolean checkCondition() {
        Logger.d(TAG, "Between9To22HourCondition checkCondition");
        boolean result = true;
        if (result){
            Logger.e(TAG, "Between9To22HourCondition interrupted");
        }
        return result;
    }
}
