package com.hawk.design.mode.notification.condition;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

import java.util.Random;

/**
 * @author Jerry
 * @Description:检查阀值条件
 * @date 2016/12/7 20:52
 * @copyright TCL-MIG
 */

public class ThresoldCon extends AConditionAction{
    public ThresoldCon(IAction parent) {
        super(parent);
    }

    @Override
    public boolean checkCondition() {
        Logger.d(TAG, "ThresoldCon checkCondition");
        boolean interrupt = new Random().nextInt(10) >= 5;
        if (interrupt){
            Logger.e(TAG, "ThresoldCon interrupted, not show");
        }
        return interrupt;
    }
}
