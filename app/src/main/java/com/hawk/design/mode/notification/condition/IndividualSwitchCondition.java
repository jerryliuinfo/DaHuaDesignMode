package com.hawk.design.mode.notification.condition;

import com.hawk.design.mode.notifypush.push.AConditionAction;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.Logger;

/**
 * @author Jerry
 * @Description:每个通知栏单独的开关
 * @date 2016/12/7 16:55
 * @copyright TCL-MIG
 */

public  class IndividualSwitchCondition extends AConditionAction {
    private final String type;//用来区分是垃圾清理的通知还是内存加速的通知还是软件管理的通知
    public static final String TYPE_JUNK = "junk";
    public static final String TYPE_BOOST = "boost";
    public static final String TYPE_APPMGT = "appmgt";

    public IndividualSwitchCondition(IAction parent,String type) {
        super(parent);
        this.type = type;
    }

    @Override
    public boolean checkCondition() {
        return notifySwitch(type);
    }
    public boolean notifySwitch(String type){
        boolean interrupt = false;
        if (TYPE_JUNK.equals(type)){
            //获取垃圾清理的云端控制开关
            interrupt = false;
            if (interrupt){
                Logger.e(TAG, "IndividualSwitchCondition TYPE_JUNK interupt");
            }
        }else if (TYPE_BOOST.equals(type)){
            //获取内存加速的云端控制开关
            interrupt = true;
            if (interrupt){
                Logger.e(TAG, "IndividualSwitchCondition TYPE_BOOST interupt");
            }
        }else if (TYPE_APPMGT.equals(type)){
            //获取软件管理的云端控制开关
            interrupt = true;
            if (!interrupt){
                Logger.e(TAG, "IndividualSwitchCondition TYPE_APPMGT interupt");
            }
        }
        return interrupt;
    }
}
