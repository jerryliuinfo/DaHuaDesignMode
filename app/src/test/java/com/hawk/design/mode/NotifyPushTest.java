package com.hawk.design.mode;

import com.hawk.design.mode.notifypush.NotifyPusher;
import com.hawk.design.mode.notifypush.push.LongTimeNoUsedPush;
import com.hawk.design.mode.notifypush.push.RamInsufficientPush;
import com.hawk.design.mode.notifypush.push.StorageOverSizePush;

import org.junit.Test;

/**
 * Created by lenovo on 2016/11/13.
 */

public class NotifyPushTest {
    @Test
    public void testNotifyPush() throws Exception {
        NotifyPusher longTimePusher = new LongTimeNoUsedPush();
        NotifyPusher overSizePusher = new StorageOverSizePush();
        NotifyPusher ramInsufficientPush = new RamInsufficientPush();
        //做优先级排序, 不满足xx天未清理的， 则检查垃圾超过xxM的, 如果不满足垃圾超过xxM的，则检查内存空间不超过xx%的
        longTimePusher.setParent(overSizePusher);
        overSizePusher.setParent(ramInsufficientPush);

        longTimePusher.dealRequest();
    }
}
