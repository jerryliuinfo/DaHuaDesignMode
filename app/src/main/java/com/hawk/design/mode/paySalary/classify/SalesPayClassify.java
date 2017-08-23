package com.hawk.design.mode.paySalary.classify;

import com.hawk.design.mode.paySalary.domain.PayDetail;
import com.hawk.design.mode.paySalary.domain.SalesReceipt;
import com.hawk.design.mode.paySalary.util.DateUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 提成支付
 * @author tery
 *
 */
public class SalesPayClassify implements IPayClassify {
	double salary;
	double rate;
	public SalesPayClassify(double salary , double rate){
		receipts = new HashMap<>();
		this.salary = salary;
		this.rate = rate;
	}
	Map<Date, SalesReceipt> receipts;
	@Override
	public double calculatePay(PayDetail detail) {
		double commission = 0.0;
		for(SalesReceipt sr : receipts.values()){
			if(DateUtil.between(sr.getSaleDate(), detail.getPayPeriodStartDate(),
					detail.getPayPeriodEndDate())){
				commission += sr.getAmount() * rate;
			}
		}
		return salary + commission;
	}

}
