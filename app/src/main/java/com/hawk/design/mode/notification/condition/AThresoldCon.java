package com.hawk.design.mode.notification.condition;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;

/**
 * @author Jerry
 * @Description:检查阀值条件
 * @date 2016/12/7 20:52
 * @copyright TCL-MIG
 */

public abstract class AThresoldCon extends AConditionAction{
    public AThresoldCon(IAction parent) {
        super(parent);
    }

    @Override
    public boolean checkCondition() {
        /*NLog.d(TAG, "AThresoldCon checkCondition");
        boolean interrupt = new Random().nextInt(10) >= 5;
        if (interrupt){
            NLog.e(TAG, "AThresoldCon interrupted, not show");
        }
        return interrupt;*/
        return isOverThresoldValue();
    }

    public abstract boolean isOverThresoldValue();

}
