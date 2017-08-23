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
		/**
		 * 月底支付,也就是从每个月的第一天开始算起
		 */
		return DateUtil.getFirstDay(payPeriodEndDate);
	}

}
