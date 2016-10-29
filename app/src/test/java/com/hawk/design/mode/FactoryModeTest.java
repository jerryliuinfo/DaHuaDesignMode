package com.hawk.design.mode;

import com.hawk.design.mode.factory.Operation;
import com.hawk.design.mode.factory.OperationFactory;

import org.junit.Test;

/**
 * @author Jerry
 * @Description:
 * @date 2016/10/29 10:48
 * @copyright TCL-MIG
 */

public class FactoryModeTest {
    private static final String TAG = FactoryModeTest.class.getSimpleName();

    @Test
    public void testFactoryMode() throws Exception {
        Operation operation = OperationFactory.createOperation(OperationFactory.TYPE_ADD);
        System.out.println("operation add = "+ operation.caculate(1,2));

        operation = OperationFactory.createOperation(OperationFactory.TYPE_SUB);
        System.out.println("operation sub = "+ operation.caculate(1,2));

        operation = OperationFactory.createOperation(OperationFactory.TYPE_MULTI);
        System.out.println("operation multi = "+ operation.caculate(1,2));

        operation = OperationFactory.createOperation(OperationFactory.TYPE_DIV);
        System.out.println("operation div = "+ operation.caculate(1,2));
    }
}
