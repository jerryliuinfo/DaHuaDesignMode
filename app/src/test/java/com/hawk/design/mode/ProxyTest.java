package com.hawk.design.mode;

import com.hawk.design.mode.proxy.AbstractTicket;
import com.hawk.design.mode.proxy.dynamic.TellerProxy;
import com.hawk.design.mode.proxy.stati.People;
import com.hawk.design.mode.proxy.stati.Teller;

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


        People people = new People(2);
        Teller teller = new Teller(people);
        teller.checkTicket("haha",2);



        people = new People(100);
        teller = new Teller(people);
        teller.checkTicket("haha",100);


        //1.创建委托类的实例，即被代理的对象
        People zhangsan = new People(5);
        //2.创建调用处理器
        TellerProxy proxy = new TellerProxy(zhangsan);

        //3.动态生成代理对象
        AbstractTicket ticket  = (AbstractTicket) proxy.getProxyInstance();

        //4.通过代理对象调用方法
        ticket.checkTicket("zhangsan",100);





    }
}
