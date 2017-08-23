package com.hawk.design.mode.paySalary.reduce;


import com.hawk.design.mode.paySalary.domain.PayDetail;

/**
 * 不扣除
 *
 */
public class NonReduce implements IReduce {
	@Override
	public double calculateDeductions(PayDetail detail) {
		
		return 0;
	}
}
