package com.hawk.design.mode.paySalary.paymethod;

import com.hawk.design.mode.paySalary.domain.PayDetail;

/**
 * 支付方式
 */
public interface IPayMethod {
	 void pay(PayDetail detail);
}
