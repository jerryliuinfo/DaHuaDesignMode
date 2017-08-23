package com.hawk.design.mode.paySalary.service;


import com.hawk.design.mode.paySalary.classify.FixedPayClassify;
import com.hawk.design.mode.paySalary.classify.HourPayClassify;
import com.hawk.design.mode.paySalary.classify.SalesPayClassify;
import com.hawk.design.mode.paySalary.domain.Employee;
import com.hawk.design.mode.paySalary.domain.PayDetail;
import com.hawk.design.mode.paySalary.domain.TimeCard;
import com.hawk.design.mode.paySalary.paymethod.PayBankMethod;
import com.hawk.design.mode.paySalary.paymethod.PayCheckMethod;
import com.hawk.design.mode.paySalary.paymethod.StayInCompanyMethod;
import com.hawk.design.mode.paySalary.reduce.NonReduce;
import com.hawk.design.mode.paySalary.schedule.MonthEndPay;
import com.hawk.design.mode.paySalary.schedule.OverWeekPay;
import com.hawk.design.mode.paySalary.schedule.WeeklyPay;
import com.hawk.design.mode.paySalary.util.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class PayService {

	List<Employee> employees = new ArrayList<>();

	public PayService() {
		employees.add(addHourlyEmployee("zhangsan","深圳", 30));
		employees.add(addSalariedEmployee("lisi","北京",15000));
		employees.add(addCommissionedEmployee("wangwu","杭州",8000, 0.1));
	}

	public   List<Employee> getAllEmployees(){
		return employees;
	}
	public void savePaycheck(PayDetail detail){
		
	}
	
	public Employee addHourlyEmployee(String name, String address, double hourlyRate){
		Employee e = new Employee(name, address);

		HourPayClassify payClassify = new HourPayClassify(hourlyRate);


		Date date1 = DateUtil.add(new Date(), -10);
		Date date2 = DateUtil.add(new Date(), -17);
		TimeCard timeCard1 = new TimeCard(date1,10);
		TimeCard timeCard2 = new TimeCard(date2,12);

		payClassify.getTimeCards().put(date1,timeCard1);
		payClassify.getTimeCards().put(date2,timeCard2);

		e.setClassification(payClassify);
		e.setSchedule(new WeeklyPay());
		e.setIPayMethod(new PayBankMethod());
		e.setiReduce(new NonReduce());
		//保存员工到数据库.. 略	
		return e;		
	}
	
	public Employee addSalariedEmployee(String name, String address, double salary){
		Employee e = new Employee(name, address);		
		e.setClassification(new FixedPayClassify(salary));
		e.setSchedule(new MonthEndPay());
		e.setIPayMethod(new PayCheckMethod());
		e.setiReduce(new NonReduce());
		//保存员工到数据库.. 略		
		return e;	
	}
	
	public Employee addCommissionedEmployee(String name, String address, double salary, double saleRate){
		Employee e = new Employee(name, address);		
		e.setClassification(new SalesPayClassify(salary, saleRate));
		e.setSchedule(new OverWeekPay());
		e.setIPayMethod(new StayInCompanyMethod());
		e.setiReduce(new NonReduce());
		//保存员工到数据库.. 略		
		return e;	
	}
}
