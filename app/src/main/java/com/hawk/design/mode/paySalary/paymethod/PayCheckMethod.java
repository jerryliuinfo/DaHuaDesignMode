package com.hawk.design.mode.paySalary.paymethod;

import com.hawk.design.mode.paySalary.domain.PayDetail;

/**
 * Created by jerryliu on 2017/8/23.
 * 支票邮寄
 */

public class PayCheckMethod implements IPayMethod {
    @Override
    public void pay(PayDetail detail) {
        System.out.println("邮寄应付： "+detail.getGrossPay() +", 扣款: "+detail.getDeductions() +" ,实付 : "+detail.getNetPay());

    }
}
