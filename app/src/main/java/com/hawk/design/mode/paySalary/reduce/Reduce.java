package com.hawk.design.mode.paySalary.reduce;


import com.hawk.design.mode.paySalary.domain.PayDetail;

public interface Reduce {

	 double calculateDeductions(PayDetail detail);
}
