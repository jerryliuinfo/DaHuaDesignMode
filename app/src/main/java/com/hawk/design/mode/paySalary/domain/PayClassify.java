package com.hawk.design.mode.paySalary.domain;
/**
 * 支付策略接口
 * @author tery
 *
 */
public interface PayClassify {
	 double calculatePay(PayDetail detail);
}
