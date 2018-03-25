package com.hawk.design.mode.factory.factorymethod;

import com.hawk.design.mode.factory.IOperation;
import com.hawk.design.mode.factory.simplefactory.OperationDiv;

/**
 * Created by lenovo on 2016/11/1.
 */

public class DivFactory implements IFactory{

    @Override
    public IOperation createOperation() {
        return new OperationDiv();
    }
}
