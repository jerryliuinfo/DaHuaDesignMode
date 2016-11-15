package com.hawk.design.mode.notifypush;

/**
 * Created by lenovo on 2016/11/15.
 */

public class NotifyHelper {
    /**
     * 检查每个通知栏需要满足的公共条件
     * 例如
     * 1.通知栏设置中的开关关闭的时候，不通知
     * 2.距离上一次通知间隔不足2小时，不弹
     * 3.一天内超过2次不弹
     * 4.不在9:00-22:00，不弹
     * @return
     */
    public static boolean checkCommonCondition(){

        return true;
    }
}
