package com.hawk.design.mode;

import com.hawk.design.mode.observer.Boss;
import com.hawk.design.mode.observer.NBAObserver;
import com.hawk.design.mode.observer.Notifier;
import com.hawk.design.mode.observer.StockObserver;

import org.junit.Test;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/4 14:16
 * @copyright TCL-MIG
 */

public class ObserverModeTest {
    @Test
    public void testObserverMode() throws Exception {
        Notifier notifier = new Boss();
        notifier.attach(new StockObserver("张三", notifier));
        notifier.attach(new NBAObserver("李四", notifier));
        notifier.notifyObserver();

    }
}
