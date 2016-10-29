package com.hawk.design.mode.setting;

/**
 * @author Jerry
 * @Description:模块popupWindow数据
 * @date 2016/10/27 17:12
 * @copyright TCL-MIG
 */

public class SettingPopWindow {

    //模块popupWindow数据
    public static long getPopupWindowAuthorizeButtonButtonStatus(){
        return DataSource.getLong(ControlAction.ACTION_POPUPWINDOW_AUTHORIZEBUTTON_BUTTONSTATUS, 1000l);
    }

}
