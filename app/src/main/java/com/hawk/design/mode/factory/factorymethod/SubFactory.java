package com.hawk.design.mode.factory.factorymethod;

import com.hawk.design.mode.factory.IOperation;
import com.hawk.design.mode.factory.simplefactory.OperationSub;

/**
 * Created by lenovo on 2016/11/1.
 */

public class SubFactory implements IFactory{

    @Override
    public IOperation createOperation() {
        return new OperationSub();
    }
}
