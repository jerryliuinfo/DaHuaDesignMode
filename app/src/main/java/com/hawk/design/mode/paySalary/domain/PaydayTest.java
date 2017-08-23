package com.hawk.design.mode.paySalary.domain;

import com.hawk.design.mode.paySalary.service.PayService;

import java.util.Date;
import java.util.List;




public class PaydayTest {
	private Date date;
	private PayService payService;
	
	public void execute(){
		List<Employee> employees = payService.getAllEmployees();
		for(Employee e : employees){
			if(e.isPayDay(date)){
				PayDetail detail = new PayDetail(e.getStartDate(date),date);
				e.payDay(detail);
				payService.savePaycheck(detail);
			}
		}
	}
}

