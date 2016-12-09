package com.hawk.design.mode.notification.junk.oversize;

import com.hawk.design.mode.notification.condition.AThresoldCon;
import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.NLog;

import java.util.Random;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/8 13:49
 * @copyright TCL-MIG
 */

public class JunkOverSizeOverThresoldCon extends AThresoldCon {
    public JunkOverSizeOverThresoldCon(IAction parent) {
        super(parent);
    }

    @Override
    public boolean isOverThresoldValue() {
        boolean interrupt;
        interrupt = new Random().nextInt(4) >= 2;
        if (interrupt){
            NLog.e(TAG, "JunkOverSizeOverThresoldCon interrupted");
        }
        return interrupt;
    }
}
