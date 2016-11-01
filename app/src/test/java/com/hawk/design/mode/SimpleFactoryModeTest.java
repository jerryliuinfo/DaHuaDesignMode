package com.hawk.design.mode;

import com.hawk.design.mode.simplefactory.IOperation;
import com.hawk.design.mode.simplefactory.OperationFactory;

import org.junit.Test;

/**
 * @author Jerry
 * @Description:
 * @date 2016/10/29 10:48
 * @copyright TCL-MIG
 */

public class SimpleFactoryModeTest {
    private static final String TAG = SimpleFactoryModeTest.class.getSimpleName();

    @Test
    public void testFactoryMode() throws Exception {
        IOperation operation = OperationFactory.createOperation(OperationFactory.TYPE_ADD);
        System.out.println("operation add = "+ operation.caculate(1,2));

        operation = OperationFactory.createOperation(OperationFactory.TYPE_SUB);
        System.out.println("operation sub = "+ operation.caculate(1,2));

        operation = OperationFactory.createOperation(OperationFactory.TYPE_MULTI);
        System.out.println("operation multi = "+ operation.caculate(1,2));

        operation = OperationFactory.createOperation(OperationFactory.TYPE_DIV);
        System.out.println("operation div = "+ operation.caculate(1,2));
    }
}
