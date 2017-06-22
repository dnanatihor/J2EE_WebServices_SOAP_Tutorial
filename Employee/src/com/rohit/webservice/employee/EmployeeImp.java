package com.rohit.webservice.employee;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.jws.WebService;

import com.rohit.dao.DaoService;
import com.rohit.dto.Employee;

@WebService(endpointInterface="com.rohit.webservice.employee.EmployeeInterface")
public class EmployeeImp implements EmployeeInterface {

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return DaoService.addEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return DaoService.deleteEmployee(id);
	}

	@Override
	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		return DaoService.getEmployee(id);
	}

	@Override
	public Employee[] getAllEmployees() {
		// TODO Auto-generated method stub
		return DaoService.getAllEmployees();
	}
	
	@Override
	public DataHandler downloadFile() {
	
		FileDataSource dataSource = new FileDataSource("/Users/loanframe/Rohit/EclipseWorkspace/WebServices/Employee/WebContent/files/full-stack-developer-interview-questions.pdf");
		return new DataHandler(dataSource);
	}
	

}
