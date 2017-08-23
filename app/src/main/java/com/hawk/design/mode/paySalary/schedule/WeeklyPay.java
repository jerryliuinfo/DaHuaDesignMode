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
		return DateUtil.add(payPeriodEndDate, -6);
	}

}