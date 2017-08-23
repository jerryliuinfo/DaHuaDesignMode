package com.hawk.design.mode.paySalary.classify;

import com.hawk.design.mode.paySalary.domain.PayClassify;
import com.hawk.design.mode.paySalary.domain.PayDetail;
import com.hawk.design.mode.paySalary.domain.TimeCard;
import com.hawk.design.mode.paySalary.util.DateUtil;

import java.util.Date;
import java.util.Map;


/**
 * 按小时支付
 * @author tery
 *
 */

public class HourlPayClassify implements PayClassify {
	private double rate;
	private Map<Date, TimeCard> timeCards;
	
	public HourlPayClassify(double hourlyRate) {
		this.rate = hourlyRate;
	}
	public void addTimeCard(TimeCard tc){
		timeCards.put(tc.getDate(), tc);
	}
	@Override
	public double calculatePay(PayDetail detail) {
		double totalPay = 0;
		for(TimeCard tc : timeCards.values()){
			if(DateUtil.between(tc.getDate(), detail.getPayPeriodStartDate(),
					detail.getPayPeriodEndDate())){
				totalPay += calculatePayForTimeCard(tc);
			}
		}		
		return totalPay;
		
	}
	private double calculatePayForTimeCard(TimeCard  tc) {
	    int hours = tc.getHours();
	    
	    if(hours > 12){
	    	return 12*rate + (hours-12) * rate * 2;
	    } else{
	    	return 12*rate;
	    }
	}
}

