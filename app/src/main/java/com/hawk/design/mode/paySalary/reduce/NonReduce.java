package com.hawk.design.mode.paySalary.reduce;


import com.hawk.design.mode.paySalary.domain.PayDetail;

/**
 * 空对象
 * @author tery
 *
 */
public class NonReduce implements Reduce{
	@Override
	public double calculateDeductions(PayDetail detail) {
		
		return 0;
	}
}
