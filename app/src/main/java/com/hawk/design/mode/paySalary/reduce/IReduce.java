package com.hawk.design.mode.paySalary.reduce;


import com.hawk.design.mode.paySalary.domain.PayDetail;

/**
 * 扣除项
 */
public interface IReduce {

	 double calculateDeductions(PayDetail detail);
}
