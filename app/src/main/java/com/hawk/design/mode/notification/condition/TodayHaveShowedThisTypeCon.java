package com.hawk.design.mode.notification.condition;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.NLog;

import java.util.Random;


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
        NLog.d(TAG, "TodayHaveShowedThisTypeCon checkCondition");
        return isThisKindOfNotifyTypeShowed();
    }






    /**
     * 遵循原有每天最多只有一个加速和一个清理的通知栏
     * @return
     */
    private boolean isThisKindOfNotifyTypeShowed(){
        int maxCount = 1;
        boolean interrupt = false;
        if (NotififyFrequencyCon.TYPE_JUNK_OVER_DAY.equals(type) || NotififyFrequencyCon.TYPE_JUNK_OVER_SIZE.equals(type)
                || NotififyFrequencyCon.TYPE_JUNK_STORAGE_UNSUFFICIENT.equals(type)){
           /* int junkCount = NotifyParamConfigManager.getInstance().getTodayNotificationCountForJunk();
            NLog.d(TAG, "isThisKindOfNotifyTypeShowed junkCount = %d, maxCount = %d", junkCount, maxCount);
            if (junkCount >= maxCount){
                NLog.d(TAG, "today have showed one of the junk notification, do not notify");
                return true;
            }*/
            interrupt = new Random().nextInt(10) >= 5;
            if (interrupt){
                NLog.e(TAG, "TodayHaveShowedThisTypeCon TYPE_JUNK  interrupted");
                return true;
            }
        }else if (NotififyFrequencyCon.TYPE_BOOST_OVER_DAY.equals(type) || NotififyFrequencyCon.TYPE_BOOST_UNSUFFICIENT.equals(type) ){
            /* int boostCount = NotifyParamConfigManager.getInstance().getTodayNotificationCountForBoost();
            NLog.d(TAG, "isThisKindOfNotifyTypeShowed boostCount = %d, maxCount = %d", boostCount, maxCount);
            if (boostCount >= maxCount){
                NLog.d(TAG, "today have showed one of the junk notification, do not notify");
                return true;
            }*/
            interrupt = new Random().nextInt(10) >= 5;
            if (interrupt){
                NLog.e(TAG, "TodayHaveShowedThisTypeCon TYPE_BOOST  interrupted");
                return true;
            }
        }else if (NotififyFrequencyCon.TYPE_APPMGT_OVER_DAY.equals(type)){
              /* int appMgtCount = NotifyParamConfigManager.getInstance().getTodayNotificationCountForAppMgt();
            NLog.d(TAG, "isThisKindOfNotifyTypeShowed mgmtCount = %d, maxCount = %d", appMgtCount, maxCount);
            if (appMgtCount >= maxCount){
                NLog.d(TAG, "today have showed one of the mgmt notification, do not notify");
                return true;
            }*/
            interrupt = new Random().nextInt(10) >= 5;
            if (interrupt){
                NLog.e(TAG, "TodayHaveShowedThisTypeCon TYPE_APPMGT  interrupted");
                return true;
            }
        }
        //NLog.d(TAG, "today have not showed this kingd of notification, do notify");
        return false;
    }


    public void updateNotificationCount(){
        if (NotififyFrequencyCon.TYPE_JUNK_OVER_DAY.equals(type) || NotififyFrequencyCon.TYPE_JUNK_OVER_SIZE.equals(type)
                || NotififyFrequencyCon.TYPE_JUNK_STORAGE_UNSUFFICIENT.equals(type)){
          /*  int junkCount = NotifyParamConfigManager.getInstance().getTodayNotificationCountForJunk();
            NotifyParamConfigManager.getInstance().setTodayNotificationCountForJunk(++junkCount);
            NLog.d(TAG, "send junk notification  count = %d", junkCount);*/
        }else if (NotififyFrequencyCon.TYPE_BOOST_OVER_DAY.equals(type) || NotififyFrequencyCon.TYPE_BOOST_UNSUFFICIENT.equals(type) ){
          /*  int boostCount = NotifyParamConfigManager.getInstance().getTodayNotificationCountForBoost();
            NotifyParamConfigManager.getInstance().setTodayNotificationCountForBoost(++boostCount);
            NLog.d(TAG, "send boost notification  count = %d", boostCount);*/
        }else if (NotififyFrequencyCon.TYPE_APPMGT_OVER_DAY.equals(type)){
           /* int appMgtCount = NotifyParamConfigManager.getInstance().getTodayNotificationCountForAppMgt();
            NotifyParamConfigManager.getInstance().setTodayNotificationCountForAppMgt(++appMgtCount);
            NLog.d(TAG, "send app mgt notification  count = %d", appMgtCount);*/
        }
    }
}
