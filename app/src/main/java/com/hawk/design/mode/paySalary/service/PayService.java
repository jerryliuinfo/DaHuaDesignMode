package com.hawk.design.mode.paySalary.service;


import com.hawk.design.mode.paySalary.classify.BasePayClassify;
import com.hawk.design.mode.paySalary.classify.HourlPayClassify;
import com.hawk.design.mode.paySalary.classify.SalesPayClassify;
import com.hawk.design.mode.paySalary.domain.Employee;
import com.hawk.design.mode.paySalary.domain.HoldMethod;
import com.hawk.design.mode.paySalary.domain.PayDetail;
import com.hawk.design.mode.paySalary.schedule.MonthEndUtil;
import com.hawk.design.mode.paySalary.schedule.OverWeekUtil;
import com.hawk.design.mode.paySalary.schedule.WeeklyUtil;

import java.util.List;




public class PayService {

	public   List<Employee> getAllEmployees(){
		return null;
	}
	public void savePaycheck(PayDetail detail){
		
	}
	
	public Employee addHourlyEmployee(String name, String address, double hourlyRate){
		Employee e = new Employee(name, address);	
		e.setClassification(new HourlPayClassify(hourlyRate));
		e.setSchedule(new WeeklyUtil());
		e.setPaymentMethod(new HoldMethod());
		//保存员工到数据库.. 略	
		return e;		
	}
	
	public Employee addSalariedEmployee(String name, String address, double salary){
		Employee e = new Employee(name, address);		
		e.setClassification(new BasePayClassify(salary));
		e.setSchedule(new MonthEndUtil());
		e.setPaymentMethod(new HoldMethod());
		//保存员工到数据库.. 略		
		return e;	
	}
	
	public Employee addCommissionedEmployee(String name, String address, double salary, double saleRate){
		Employee e = new Employee(name, address);		
		e.setClassification(new SalesPayClassify(salary, saleRate));
		e.setSchedule(new OverWeekUtil());
		e.setPaymentMethod(new HoldMethod());
		//保存员工到数据库.. 略		
		return e;	
	}
}
