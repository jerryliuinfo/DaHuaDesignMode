package com.hawk.design.mode.notification.condition.common;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:检查是否处于通话或者全屏状态
 * @date 2016/12/7 10:13
 * @copyright TCL-MIG
 */

public class PhoningFullScreenCon extends AConditionAction {
    public PhoningFullScreenCon( IAction parent) {
        super(parent);
    }
    @Override
    public boolean checkCondition() {
        Logger.d(TAG, "PhoningFullScreenCon checkCondition");
        boolean result = false;
        if (result){
            Logger.e(TAG, "PhoningFullScreenCon interrupted");
        }
        return result;
    }

}
