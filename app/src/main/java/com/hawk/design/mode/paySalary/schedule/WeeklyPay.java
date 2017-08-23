package com.hawk.design.mode.paySalary.schedule;

import com.hawk.design.mode.paySalary.util.DateUtil;

import java.util.Date;





public class WeeklyPay implements IPayDate {

	@Override
	public boolean isPayDate(Date date) {		
		return DateUtil.isFriday(date);
	}
	@Override
	public Date getPayPeriodStartDate(Date payPeriodEndDate) {
		//从本次支付时间减去6天 也就是从上周六开始
		return DateUtil.add(payPeriodEndDate, -6);
	}

}
