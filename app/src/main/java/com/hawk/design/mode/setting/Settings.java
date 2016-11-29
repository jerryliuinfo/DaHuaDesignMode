package com.hawk.design.mode.setting;

/**
 * @author Jerry
 * @Description:
 * @date 2016/10/27 16:46
 * @copyright TCL-MIG
 */

public class Settings {
    //Display模块数据
    public static class SettingDisplay {
        public static long getADisplayTime(){
            return DataSource.getLong(ControlAction.ACTION_DISPLAY_RESIDUAL_DISPLAYTIME, -1);
        }

    }
    //noticebar模块
    public static class SettingNoticeBar {
        //common数据
        public static long getNoticebarCommonProcessSurvivalTime(){
            return DataSource.getLong(ControlAction.ACTION_NOTICEBAR_COMMON_PROCESSSURVIVALTIME,-1);
        }
        //ram数据
        public static long getNoticebarRamBarswitch(){
            return DataSource.getLong(ControlAction.ACTION_NOTICEBAR_RAM_BARSWITCH,-1);
        }
    }





}
