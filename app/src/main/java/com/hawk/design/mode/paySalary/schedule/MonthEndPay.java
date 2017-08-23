package com.hawk.design.mode.paySalary.schedule;

import com.hawk.design.mode.paySalary.util.DateUtil;

import java.util.Date;




public class MonthEndPay implements IPayDate {

	@Override
	public boolean isPayDate(Date date) {		
		return DateUtil.isLastDayOfMonth(date);
	}

	@Override
	public Date getPayPeriodStartDate(Date payPeriodEndDate) {		
		return DateUtil.getFirstDay(payPeriodEndDate);
	}

}
