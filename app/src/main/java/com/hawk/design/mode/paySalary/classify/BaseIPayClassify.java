package com.hawk.design.mode.paySalary.classify;


import com.hawk.design.mode.paySalary.domain.PayDetail;

/**
 * 固薪支付
 * @author tery
 *
 */
public class BaseIPayClassify implements IPayClassify {
	private double salary;
	public BaseIPayClassify(double salary){
		this.salary = salary;
	}
	@Override
	public double calculatePay(PayDetail pc) {
		return salary;
	}

}
