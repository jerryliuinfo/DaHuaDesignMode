package com.hawk.design.mode;

import com.hawk.design.mode.proxy.Proxy;
import com.hawk.design.mode.proxy.ProxySubject;
import com.hawk.design.mode.proxy.SchoolGirl;
import com.hawk.design.mode.strategy.StrategyContext;

import org.junit.Test;

/**
 * @author Jerry
 * @Description:
 * @date 2016/11/1 20:57
 * @copyright TCL-MIG
 */

public class ProxyTest {
    @Test
    public void testProxyMode() throws Exception {
        SchoolGirl girl = new SchoolGirl("Lucy");
        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();


        ProxySubject proxySubject = new ProxySubject();
        proxySubject.request();
    }
}
