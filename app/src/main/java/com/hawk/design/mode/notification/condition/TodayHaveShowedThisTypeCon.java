package com.hawk.design.mode.notification.condition;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

import java.util.Random;

import static com.hawk.design.mode.notification.condition.IndividualSwitchCondition.TYPE_APPMGT;
import static com.hawk.design.mode.notification.condition.IndividualSwitchCondition.TYPE_BOOST;
import static com.hawk.design.mode.notification.condition.IndividualSwitchCondition.TYPE_JUNK;

/**
 * @author Jerry
 * @Description:今天是否有弹过这类通知栏
 * @date 2016/12/7 18:50
 * @copyright TCL-MIG
 */

public class TodayHaveShowedThisTypeCon extends AConditionAction {

    private final String type;//用来区分是垃圾清理的通知还是内存加速的通知还是软件管理的通知

    public TodayHaveShowedThisTypeCon(IAction parent, String type) {
        super(parent);
        this.type = type;
    }

    @Override
    public boolean checkCondition() {
        Logger.d(TAG, "TodayHaveShowedThisTypeCon checkCondition");
        return isThisKindOfTypeShowed();
    }

    private boolean isThisKindOfTypeShowed() {

        return isThisKindOfNotifyTypeShowed();
    }





    /**
     * 遵循原有每天最多只有一个加速和一个清理的通知栏
     * @return
     */
    private boolean isThisKindOfNotifyTypeShowed(){
        int maxCount = 1;
        boolean interrupt = false;
        //垃圾清理
        if (TYPE_JUNK.equals(type)){
           /* int junkCount = NotifyParamConfigManager.getInstance().getTodayNotificationCountForJunk();
            Logger.d(TAG, "isThisKindOfNotifyTypeShowed junkCount = %d, maxCount = %d", junkCount, maxCount);
            if (junkCount >= maxCount){
                Logger.d(TAG, "today have showed one of the junk notification, do not notify");
                return true;
            }*/
            interrupt = new Random().nextInt(10) >= 5;
            if (interrupt){
                Logger.e(TAG, "TYPE_JUNK isThisKindOfNotifyTypeShowed interrupted, not show");
                return true;
            }
        }
        //内存加速
        else if (TYPE_BOOST.equals(type)){
           /* int boostCount = NotifyParamConfigManager.getInstance().getTodayNotificationCountForBoost();
            Logger.d(TAG, "isThisKindOfNotifyTypeShowed boostCount = %d, maxCount = %d", boostCount, maxCount);
            if (boostCount >= maxCount){
                Logger.d(TAG, "today have showed one of the junk notification, do not notify");
                return true;
            }*/
            interrupt = new Random().nextInt(10) >= 5;
            if (interrupt){
                Logger.e(TAG, "TYPE_BOOST isThisKindOfNotifyTypeShowed interrupted, not show");
                return true;
            }
        }
        //软件管理
        else if (TYPE_APPMGT.equals(type)){
           /* int appMgtCount = NotifyParamConfigManager.getInstance().getTodayNotificationCountForAppMgt();
            Logger.d(TAG, "isThisKindOfNotifyTypeShowed mgmtCount = %d, maxCount = %d", appMgtCount, maxCount);
            if (appMgtCount >= maxCount){
                Logger.d(TAG, "today have showed one of the mgmt notification, do not notify");
                return true;
            }*/
            interrupt = new Random().nextInt(10) >= 5;
            if (interrupt){
                Logger.e(TAG, "TYPE_APPMGT isThisKindOfNotifyTypeShowed interrupted, not show");
                return true;
            }
        }
        Logger.d(TAG, "today have not showed this kingd of notification, do notify");
        return false;
    }

}
