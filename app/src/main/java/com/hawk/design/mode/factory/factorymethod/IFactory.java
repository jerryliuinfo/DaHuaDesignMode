package com.hawk.design.mode.factory.factorymethod;

import com.hawk.design.mode.factory.IOperation;

/**
 * Created by lenovo on 2016/11/1.
 */

public interface IFactory {
    IOperation createOperation();
}
