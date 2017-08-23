package com.hawk.design.mode;

import com.hawk.design.mode.paySalary.domain.Employee;
import com.hawk.design.mode.paySalary.domain.PayDetail;
import com.hawk.design.mode.paySalary.service.PayService;
import com.hawk.design.mode.paySalary.util.DateUtil;

import org.junit.Test;

import java.util.Date;
import java.util.List;


public class PaydayTest {

	@Test
	public  void execute(){
		Date date = DateUtil.add(new Date(), -4);
		PayService payService = new PayService();
		List<Employee> employees = payService.getAllEmployees();
		for(Employee e : employees){
			//if(e.isPayDay(date)){
				PayDetail detail = new PayDetail(e.getStartDate(date),date);
				e.payDay(detail);
				payService.savePaycheck(detail);
			//}
		}
	}

}

