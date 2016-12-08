package com.hawk.design.mode.notification.condition.common;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:设置界面的通知栏全局开关
 * @date 2016/12/7 10:10
 * @copyright TCL-MIG
 */

public class GlobalSwitchCon extends AConditionAction{
    public GlobalSwitchCon(IAction parent) {
        super(parent);
    }

    /**
     *  判断自己的条件，不符合，就返回True
     * @return
     */
    @Override
    public boolean checkCondition() {
        NLog.d(TAG, "GlobalSwitchCon checkCondition");
        boolean result = false;
        if (result){
            NLog.e(TAG, "GlobalSwitchCon interrupted");
        }
        return result;
    }
}
