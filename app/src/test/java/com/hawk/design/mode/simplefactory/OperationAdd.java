package com.hawk.design.mode.simplefactory;

/**
 * @author Jerry
 * @Description:
 * @date 2016/10/29 10:37
 * @copyright TCL-MIG
 */

public class OperationAdd implements IOperation {


    @Override
    public double caculate(double num1, double num2) {
        return num1 + num2;
    }
}
