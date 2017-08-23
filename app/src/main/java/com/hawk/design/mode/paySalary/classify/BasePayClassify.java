package com.hawk.design.mode.paySalary.classify;


import com.hawk.design.mode.paySalary.domain.PayClassify;
import com.hawk.design.mode.paySalary.domain.PayDetail;

/**
 * 固薪支付
 * @author tery
 *
 */
public class BasePayClassify implements PayClassify {
	private double salary;
	public BasePayClassify(double salary){
		this.salary = salary;
	}
	@Override
	public double calculatePay(PayDetail pc) {
		return salary;
	}

}
