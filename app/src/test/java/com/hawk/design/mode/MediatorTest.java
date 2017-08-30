package com.hawk.design.mode;

import com.hawk.design.mode.mediator.ConcreteColleage1;
import com.hawk.design.mode.mediator.ConcreteColleage2;
import com.hawk.design.mode.mediator.ConcreteMediator;

import org.junit.Test;

/**
 * Created by jerryliu on 2017/8/30.
 */

public class MediatorTest {

    @Test
    public void testMediator(){
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleage1 c1 = new ConcreteColleage1(mediator);
        ConcreteColleage2 c2 = new ConcreteColleage2(mediator);

        mediator.setColleage1(c1);
        mediator.setColleage2(c2);

        c1.send("吃过饭了吗");
        c2.send("没有呢 ？ 你打算请客?");


    }
}
