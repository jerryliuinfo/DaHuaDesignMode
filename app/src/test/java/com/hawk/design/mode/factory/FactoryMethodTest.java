package com.hawk.design.mode.factory;

import com.hawk.design.mode.factory.factorymethod.AddFactory;
import com.hawk.design.mode.factory.factorymethod.DivFactory;
import com.hawk.design.mode.factory.factorymethod.IFactory;
import com.hawk.design.mode.factory.factorymethod.MultiFactory;
import com.hawk.design.mode.factory.factorymethod.SubFactory;

import org.junit.Test;

/**
 * Created by lenovo on 2016/11/1.
 */

public class FactoryMethodTest {
    @Test
    public void testFactoryMethodMode() throws Exception {
        IFactory factory = new AddFactory();
        IOperation operation = factory.createOperation();
        System.out.println("add factory: "+ operation.caculate(2,5));

        factory = new SubFactory();
        operation = factory.createOperation();
        System.out.println("sub factory: "+ operation.caculate(2,5));

        factory = new MultiFactory();
        operation = factory.createOperation();
        System.out.println("multi factory: "+ operation.caculate(2,5));

        factory = new DivFactory();
        operation = factory.createOperation();
        System.out.println("div factory: "+ operation.caculate(2,5));
    }
}
