package com.rohit.webservice.employee;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlElement;

import com.rohit.dto.Employee;

@WebService
@SOAPBinding(style=Style.RPC)
public interface EmployeeInterface {

	@WebMethod
	public String addEmployee(Employee p);
	
	@WebMethod
	public boolean deleteEmployee(@XmlElement( required = true ) String id);
	
	@WebMethod
	public Employee getEmployee(@XmlElement( required = true ) String id);
	
	@WebMethod
	public Employee[] getAllEmployees();
	
	@WebMethod
	public DataHandler downloadFile();
}
