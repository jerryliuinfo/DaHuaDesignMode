package com.hawk.design.mode.notification.boost.unsufficient;

import android.app.Activity;

import com.hawk.design.mode.notification.ABaseNotifyPush;
import com.hawk.design.mode.notification.condition.AThresoldCon;
import com.hawk.design.mode.notification.condition.IndividualSwitchCondition;
import com.hawk.design.mode.notification.condition.NotififyFrequencyCon;
import com.hawk.design.mode.notification.condition.TodayHaveShowedThisCon;
import com.hawk.design.mode.notification.condition.TodayHaveShowedThisTypeCon;
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
        // 组装公共条件
        IAction commonCondition = getCommonCondition();
        /*****************************组装自己条件******************************/
        //1.检查单独开关
        IndividualSwitchCondition switchCondition = new IndividualSwitchCondition(commonCondition,NotififyFrequencyCon.TYPE_BOOST_UNSUFFICIENT);
        //2.检查今天是否有弹此类通知
        final TodayHaveShowedThisTypeCon todayHaveShowedThisTypeCon = new TodayHaveShowedThisTypeCon(switchCondition,NotififyFrequencyCon.TYPE_BOOST_UNSUFFICIENT);
        //3.检查今天是否有弹过这个通知
        final TodayHaveShowedThisCon todayHaveShowedCon = new TodayHaveShowedThisCon(todayHaveShowedThisTypeCon, "last_ram_storage_insufficient_notify_time");
        //4.检查通知频率间隔是否满足了要求
        NotififyFrequencyCon notififyFrequencyCon = new NotififyFrequencyCon(todayHaveShowedCon,NotififyFrequencyCon.TYPE_BOOST_UNSUFFICIENT);
        //5.检查阀值
        AThresoldCon thresoldCon = new RamUnsufficientThresoldCon(notififyFrequencyCon);
        RamUnsufficientPush push = new RamUnsufficientPush(null, parentPush, thresoldCon) {

            @Override
            public void onNotifySuccess() {
                super.onNotifySuccess();
                todayHaveShowedCon.updateLastNotifyTime();
                todayHaveShowedThisTypeCon.updateNotificationCount();
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
