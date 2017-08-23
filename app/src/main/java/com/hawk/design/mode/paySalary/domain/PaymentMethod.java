package com.hawk.design.mode.paySalary.domain;

/**
 * 支付方式
 */
public interface PaymentMethod {
	 void pay(PayDetail detail);
}
