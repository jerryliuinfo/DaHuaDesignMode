package com.hawk.design.mode;

import com.hawk.design.mode.resonsechain.CommonManager;
import com.hawk.design.mode.resonsechain.Concentrate1Handler;
import com.hawk.design.mode.resonsechain.Concentrate2Handler;
import com.hawk.design.mode.resonsechain.Concentrate3Handler;
import com.hawk.design.mode.resonsechain.GeneralManager;
import com.hawk.design.mode.resonsechain.Handler;
import com.hawk.design.mode.resonsechain.Manager;
import com.hawk.design.mode.resonsechain.Request;

import org.junit.Test;

/**
 * Created by lenovo on 2016/11/13.
 */

public class ResponsibityChainTest {
    @Test
    public void testResponseChainMode() throws Exception {
        Handler handler1 = new Concentrate1Handler();
        Handler handler2 = new Concentrate2Handler();
        Handler handler3 = new Concentrate3Handler();

        handler1.setParent(handler2);
        handler2.setParent(handler3);

        int[] request = {2,5,14,22,18,3,27,20};
        for (int i = 0; i < request.length; i++) {
            handler1.handleRequest(request[i]);
        }


        Manager commonManager = new CommonManager("经理");
        Manager majorManager = new CommonManager("总监");
        Manager generalManager = new GeneralManager("总监");

        commonManager.setSuperior(majorManager);
        majorManager.setSuperior(generalManager);

        Request request1 = new Request(Request.TYPE_LEAVE,"小菜请假", 1);
        commonManager.dealRequest(request1);

        Request request2 = new Request(Request.TYPE_LEAVE,"小菜请假", 4);
        commonManager.dealRequest(request2);

        Request request3 = new Request(Request.TYPE_SALARY,"小菜加薪", 500);
        commonManager.dealRequest(request3);

        Request request4 = new Request(Request.TYPE_SALARY,"小菜加薪", 2100);
        commonManager.dealRequest(request4);
    }
}
