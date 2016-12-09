package com.hawk.design.mode.notification.condition;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.NLog;

/**
 * @author Jerry
 * @Description:每个通知栏单独的开关
 * @date 2016/12/7 16:55
 * @copyright TCL-MIG
 */

public  class IndividualSwitchCondition extends AConditionAction {
    private final String type;//用来区分是垃圾清理的通知还是内存加速的通知还是软件管理的通知

    public IndividualSwitchCondition(IAction parent,String type) {
        super(parent);
        this.type = type;
    }

    @Override
    public boolean checkCondition() {
        NLog.d(TAG, "IndividualSwitchCondition checkCondition");
        return notifySwitch(type);
    }
    public boolean notifySwitch(String type){
        boolean interrupt = false;
        if (NotififyFrequencyCon.TYPE_JUNK_OVER_DAY.equals(type) || NotififyFrequencyCon.TYPE_JUNK_OVER_SIZE.equals(type)
                || NotififyFrequencyCon.TYPE_JUNK_STORAGE_UNSUFFICIENT.equals(type)){
            //获取垃圾清理的云端控制开关
            interrupt = false;
            if (interrupt){
                NLog.e(TAG, "IndividualSwitchCondition TYPE_JUNK interupt");
            }
        }else if (NotififyFrequencyCon.TYPE_BOOST_OVER_DAY.equals(type) || NotififyFrequencyCon.TYPE_BOOST_UNSUFFICIENT.equals(type) ){
            //获取内存加速的云端控制开关
            interrupt = false;
            if (interrupt){
                NLog.e(TAG, "IndividualSwitchCondition TYPE_BOOST interupt");
            }
        }else if (NotififyFrequencyCon.TYPE_APPMGT_OVER_DAY.equals(type)){
            //获取软件管理的云端控制开关
            interrupt = false;
            if (!interrupt){
                NLog.e(TAG, "IndividualSwitchCondition TYPE_APPMGT interupt");
            }
        }
        return interrupt;
    }
}
