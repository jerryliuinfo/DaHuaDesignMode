package com.hawk.design.mode.notification.boost.overday;

import android.app.Activity;

import com.hawk.design.mode.notifypush.push.APushAction;
import com.hawk.design.mode.permission.IAction;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 17:02
 * @copyright TCL-MIG
 */

public class RamLongTimeNoUsedPush extends APushAction {
    public RamLongTimeNoUsedPush(Activity context, IAction parentPush, IAction conditionAction) {
        super(context, parentPush, conditionAction);
    }

    @Override
    public void runNotify() {

    }
}
