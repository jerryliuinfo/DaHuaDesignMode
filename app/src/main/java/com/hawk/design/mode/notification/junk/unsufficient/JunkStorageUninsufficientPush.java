package com.hawk.design.mode.notification.junk.unsufficient;

import android.app.Activity;

import com.hawk.design.mode.notification.ABaseNotifyPush;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 17:01
 * @copyright TCL-MIG
 */

public class JunkStorageUninsufficientPush extends ABaseNotifyPush{
    public JunkStorageUninsufficientPush(Activity context, IAction parentPush, IAction conditionAction) {
        super(context, parentPush, conditionAction);
    }



    @Override
    public void runNotify() {
        Logger.d(TAG,"JunkStorageUninsufficientPush show Notify");
        boolean showNotificationResult = true;
        if (showNotificationResult) {
            onNotifySuccess();
        }
        else {
            onNotifyFaild();
        }
    }

}
