package com.hawk.design.mode.notification.condition.common;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:通知栏1天是否超过2次
 * @date 2016/12/7 10:18
 * @copyright TCL-MIG
 */

public class OverMaxNubmerCon extends AConditionAction{
    public OverMaxNubmerCon(IAction parent) {
        super(parent);
    }

    @Override
    public boolean checkCondition() {
        Logger.d(TAG, "OverMaxNubmerCon checkCondition");
        boolean result = false;
        if (result){
            Logger.e(TAG, "OverMaxNubmerCon interrupted");
        }
        return result;
    }
}
