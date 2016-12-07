package com.hawk.design.mode.notification.junk.overday;

import com.hawk.design.mode.notification.ABaseNotifyPush;
import com.hawk.design.mode.notification.condition.IndividualSwitchCondition;
import com.hawk.design.mode.notification.condition.NotififyFrequencyCon;
import com.hawk.design.mode.notification.condition.TodayHaveShowedCon;
import com.hawk.design.mode.notifypush.push.Con02;
import com.hawk.design.mode.notifypush.push.Con03;
import com.hawk.design.mode.notifypush.push.Con04;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 16:09
 * @copyright TCL-MIG
 */

public class JunkLongTimeUnusedPush extends ABaseNotifyPush {

    public static JunkLongTimeUnusedPush newInstace(IAction parentPush) {
        // 获取公共条件
        IAction commonCondition = getCommonCondition();
        // 组装自己条件
        IndividualSwitchCondition switchCondition = new IndividualSwitchCondition(commonCondition,IndividualSwitchCondition.TYPE_JUNK);
        final TodayHaveShowedCon todayHaveShowedCon = new TodayHaveShowedCon(switchCondition, "last_notify_unuse_longtime");
        NotififyFrequencyCon notififyFrequencyCon = new NotififyFrequencyCon(todayHaveShowedCon,NotififyFrequencyCon.TYPE_JUNK_OVER_DAY);
        JunkLongTimeUnusedPush push = new JunkLongTimeUnusedPush(parentPush, notififyFrequencyCon) {

            @Override
            public void onNotifySuccess() {
                super.onNotifySuccess();
                todayHaveShowedCon.setLastNotifyTime(System.currentTimeMillis());
            }

        };

        return push;
    }

    private JunkLongTimeUnusedPush(IAction parentPush, IAction conditionAction) {
        super(null, parentPush, conditionAction);
    }

    public static IAction getIndividualAction(IAction commonCondition){
        Con02 con02 = new Con02(commonCondition);// 不中断条件
        Con03 con03 = new Con03(con02);// 随机中断
        Con04 con04 = new Con04(con03);// 随机中断
        return con04;

       /* ATodayHaveShowedCon todayHaveShowedCon = new JunkLongTimeTodayShowedCon(null,null) ;
        NotififyFrequencyCon notififyFrequencyCon = new JunkLongTimeFrequencyCon(null,todayHaveShowedCon);
        return notififyFrequencyCon;*/
    }

    @Override
    public void runNotify() {
        Logger.d(TAG,"JunkLongTimeUnusedPush show Notify");
        boolean showNotificationResult = true;
        if (showNotificationResult) {
            onNotifySuccess();
        }
        else {
            onNotifyFaild();
        }
    }



}