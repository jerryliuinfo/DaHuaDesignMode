package com.hawk.design.mode.factorymethod;

import com.hawk.design.mode.simplefactory.IOperation;

/**
 * Created by lenovo on 2016/11/1.
 */

public interface IFactory {
    IOperation createOperation();
}
