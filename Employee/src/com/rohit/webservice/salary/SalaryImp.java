package com.rohit.webservice.salary;

import javax.jws.WebService;

import com.rohit.dao.DaoService;

@WebService(endpointInterface="com.rohit.webservice.salary.SalaryInterface")
public class SalaryImp implements SalaryInterface {

	@Override
	public boolean salary(String employeeId, int salary) {
		return DaoService.addSalary(employeeId, salary);
	}

	@Override
	public Long getTotalSalary(String employeeId) {
		
		return DaoService.getTotalSalary(employeeId);
	}

}
