package com.rohit.webservice.salary;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlElement;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface SalaryInterface {
	
	@WebMethod
	public boolean salary(@XmlElement( required = true ) String employeeId, @XmlElement( required = true ) int salary);
	
	@WebMethod
	public Long getTotalSalary(@XmlElement( required = true )  String employeeId);
}
