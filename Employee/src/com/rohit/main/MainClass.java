package com.rohit.main;

import javax.xml.ws.Endpoint;

import com.rohit.webservice.employee.EmployeeImp;
import com.rohit.webservice.salary.SalaryImp;

public class MainClass {
	
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:9999/ws/employee", new EmployeeImp());
		Endpoint.publish("http://localhost:9999/ws/salary", new SalaryImp());
	}

}
 