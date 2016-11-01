package com.hawk.design.mode.factorymethod;

import com.hawk.design.mode.simplefactory.IOperation;
import com.hawk.design.mode.simplefactory.OperationAdd;

/**
 * Created by lenovo on 2016/11/1.
 */

public class AddFactory implements IFactory{

    @Override
    public IOperation createOperation() {
        return new OperationAdd();
    }
}
