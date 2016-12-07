package com.hawk.design.mode.notification.junk.oversize;

import android.app.Activity;

import com.hawk.design.mode.notification.ABaseNotifyPush;
import com.hawk.design.mode.notification.condition.IndividualSwitchCondition;
import com.hawk.design.mode.notification.condition.NotififyFrequencyCon;
import com.hawk.design.mode.notification.condition.TodayHaveShowedCon;
import com.hawk.design.mode.notifypush.push.Con01;
import com.hawk.design.mode.notifypush.push.Con02;
import com.hawk.design.mode.notifypush.push.Con03;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 16:15
 * @copyright TCL-MIG
 */

public class JunkOverSizePush extends ABaseNotifyPush {
    public static JunkOverSizePush newInstace(IAction parentPush) {
        // 获取公共条件
        IAction commonCondition = getCommonCondition();
        // 组装自己条件
        IndividualSwitchCondition switchCondition = new IndividualSwitchCondition(commonCondition,IndividualSwitchCondition.TYPE_JUNK);
        final TodayHaveShowedCon todayHaveShowedCon = new TodayHaveShowedCon(switchCondition, "last_notify_storage_oversize_time");
        NotififyFrequencyCon notififyFrequencyCon = new NotififyFrequencyCon(todayHaveShowedCon,NotififyFrequencyCon.TYPE_JUNK_OVER_DAY);

        JunkOverSizePush push = new JunkOverSizePush(parentPush, notififyFrequencyCon) {

            @Override
            public void onNotifySuccess() {
                super.onNotifySuccess();
                todayHaveShowedCon.setLastNotifyTime(System.currentTimeMillis());
            }

        };

        return push;
    }
    private JunkOverSizePush(IAction parentPush, IAction conditionAction) {
        super(null, parentPush, conditionAction);
    }


    @Override
    public void runNotify() {
        Logger.d(TAG,"JunkOverSizePush show Notify");
        boolean showNotificationResult = true;
        if (showNotificationResult) {
            onNotifySuccess();
        }
        else {
            onNotifyFaild();
        }
    }


    public static IAction getIndividualAction(IAction commonCondition){
        Con01 con01 = new Con01(commonCondition);
        Con02 con02 = new Con02(con01);// 不中断条件
        Con03 con03 = new Con03(con02);// 随机中断
        return con03;
       /* ATodayHaveShowedCon todayHaveShowedCon = new JunkOverSizeTodayShowedCon(null,null) ;
        NotififyFrequencyCon notififyFrequencyCon = new JunkOverSizeFrequencyCon(null,todayHaveShowedCon);
        return notififyFrequencyCon;*/
    }

}
