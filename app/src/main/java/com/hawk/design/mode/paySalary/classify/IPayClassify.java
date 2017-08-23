package com.hawk.design.mode.paySalary.classify;

import com.hawk.design.mode.paySalary.domain.PayDetail;

/**
 * 支付策略接口
 * @author tery
 *
 */
public interface IPayClassify {
	 double calculatePay(PayDetail detail);
}
