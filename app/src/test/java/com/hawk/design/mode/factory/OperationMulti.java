package com.hawk.design.mode.factory;

/**
 * @author Jerry
 * @Description:
 * @date 2016/10/29 10:40
 * @copyright TCL-MIG
 */

public class OperationMulti implements Operation {
    @Override
    public double caculate(double num1, double num2) {
        return num1 * num2;
    }
}
