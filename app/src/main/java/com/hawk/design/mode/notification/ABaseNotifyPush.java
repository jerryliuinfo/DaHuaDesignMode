package com.hawk.design.mode.notification;

import android.app.Activity;

import com.hawk.design.mode.notification.condition.common.Between9To22HourCondition;
import com.hawk.design.mode.notification.condition.common.GlobalSwitchCon;
import com.hawk.design.mode.notification.condition.common.Over2HoursCon;
import com.hawk.design.mode.notification.condition.common.OverMaxNubmerCon;
import com.hawk.design.mode.notification.condition.common.PhoningFullScreenCon;
import com.hawk.design.mode.notifypush.push.APushAction;
import com.hawk.design.mode.permission.IAction;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 16:10
 * @copyright TCL-MIG
 */

public abstract class ABaseNotifyPush extends APushAction {

    public ABaseNotifyPush(Activity context, IAction parentPush, IAction conditionAction) {
        super(context, parentPush, conditionAction);
    }


    public void onNotifySuccess() {

    }

    public void onNotifyFaild() {

    }

    /**
     * 组装公共条件
     * @return
     */
    public static IAction getCommonCondition(){
        // 获取公共条件
        GlobalSwitchCon switchCon = new GlobalSwitchCon(null);
        OverMaxNubmerCon maxNubmerCon = new OverMaxNubmerCon(switchCon);
        PhoningFullScreenCon fullScreenCon = new PhoningFullScreenCon(maxNubmerCon);
        Over2HoursCon over2HoursCon = new Over2HoursCon(fullScreenCon);
        Between9To22HourCondition between9To22HourCondition = new Between9To22HourCondition(over2HoursCon);
        return between9To22HourCondition;
    }

}
