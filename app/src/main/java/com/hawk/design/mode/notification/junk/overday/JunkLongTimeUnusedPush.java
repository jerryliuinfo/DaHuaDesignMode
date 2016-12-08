package com.hawk.design.mode.notification.junk.overday;

import com.hawk.design.mode.notification.ABaseNotifyPush;
import com.hawk.design.mode.notification.condition.IndividualSwitchCondition;
import com.hawk.design.mode.notification.condition.NotififyFrequencyCon;
import com.hawk.design.mode.notification.condition.ThresoldCon;
import com.hawk.design.mode.notification.condition.TodayHaveShowedThisCon;
import com.hawk.design.mode.notification.condition.TodayHaveShowedThisTypeCon;
import com.hawk.design.mode.notifypush.push.Con02;
import com.hawk.design.mode.notifypush.push.Con03;
import com.hawk.design.mode.notifypush.push.Con04;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.NLog;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 16:09
 * @copyright TCL-MIG
 */

public class JunkLongTimeUnusedPush extends ABaseNotifyPush {

    public static JunkLongTimeUnusedPush newInstace(IAction parentPush) {
        // 组装公共条件
        IAction commonCondition = getCommonCondition();
        /*****************************组装自己条件******************************/
        //1.检查单独开关
        IndividualSwitchCondition switchCondition = new IndividualSwitchCondition(commonCondition,NotififyFrequencyCon.TYPE_JUNK_OVER_DAY);
        //2.检查今天是否有弹此类通知
        TodayHaveShowedThisTypeCon todayHaveShowedThisTypeCon = new TodayHaveShowedThisTypeCon(switchCondition,NotififyFrequencyCon.TYPE_JUNK_OVER_DAY);
        //3.检查今天是否有弹过这个通知
        final TodayHaveShowedThisCon todayHaveShowedCon = new TodayHaveShowedThisCon(todayHaveShowedThisTypeCon, "last_notify_unuse_longtime");
        //4.检查通知频率间隔是否满足了要求
        NotififyFrequencyCon notififyFrequencyCon = new NotififyFrequencyCon(todayHaveShowedCon,NotififyFrequencyCon.TYPE_JUNK_OVER_DAY);
        //5.检查阀值
        ThresoldCon thresoldCon = new ThresoldCon(notififyFrequencyCon);

        JunkLongTimeUnusedPush push = new JunkLongTimeUnusedPush(parentPush, thresoldCon) {

            @Override
            public void onNotifySuccess() {
                super.onNotifySuccess();
                todayHaveShowedCon.updateLastNotifyTime();
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
        NLog.d(TAG,"JunkLongTimeUnusedPush show Notify");

        boolean showNotificationResult = true;
        if (showNotificationResult) {
            onNotifySuccess();
        }
        else {
            onNotifyFaild();
        }
    }



}
