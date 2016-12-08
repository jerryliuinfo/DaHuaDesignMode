package com.hawk.design.mode.notification.boost.unsufficient;

import android.app.Activity;

import com.hawk.design.mode.notification.ABaseNotifyPush;
import com.hawk.design.mode.notification.condition.IndividualSwitchCondition;
import com.hawk.design.mode.notification.condition.NotififyFrequencyCon;
import com.hawk.design.mode.notification.condition.TodayHaveShowedThisCon;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.NLog;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 16:49
 * @copyright TCL-MIG
 */

public class RamUnsufficientPush extends ABaseNotifyPush {
    public static RamUnsufficientPush newInstace(IAction parentPush) {
        // 获取公共条件
        IAction commonCondition = getCommonCondition();
        // 组装自己条件
        IndividualSwitchCondition switchCondition = new IndividualSwitchCondition(commonCondition,NotififyFrequencyCon.TYPE_BOOST_OVER_DAY);
        final TodayHaveShowedThisCon todayHaveShowedCon = new TodayHaveShowedThisCon(switchCondition, "last_ram_storage_insufficient_notify_time");
        NotififyFrequencyCon notififyFrequencyCon = new NotififyFrequencyCon(todayHaveShowedCon,NotififyFrequencyCon.TYPE_BOOST_OVER_DAY);

        RamUnsufficientPush push = new RamUnsufficientPush(null, parentPush, notififyFrequencyCon) {

            @Override
            public void onNotifySuccess() {
                super.onNotifySuccess();
                todayHaveShowedCon.updateLastNotifyTime();
            }
        };

        return push;
    }

    private RamUnsufficientPush(Activity context, IAction parentPush, IAction conditionAction) {
        super(context, parentPush, conditionAction);
    }


    @Override
    public void runNotify() {
        NLog.d(TAG,"RamUnsufficientPush show Notify");
    }
}
