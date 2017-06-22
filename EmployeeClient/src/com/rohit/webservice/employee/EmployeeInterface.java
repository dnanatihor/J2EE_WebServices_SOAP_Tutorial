
package com.rohit.webservice.employee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeInterface", targetNamespace = "http://employee.webservice.rohit.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeInterface {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://employee.webservice.rohit.com/EmployeeInterface/addEmployeeRequest", output = "http://employee.webservice.rohit.com/EmployeeInterface/addEmployeeResponse")
    public String addEmployee(
        @WebParam(name = "arg0", partName = "arg0")
        Employee arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://employee.webservice.rohit.com/EmployeeInterface/deleteEmployeeRequest", output = "http://employee.webservice.rohit.com/EmployeeInterface/deleteEmployeeResponse")
    public boolean deleteEmployee(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.rohit.webservice.employee.Employee
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://employee.webservice.rohit.com/EmployeeInterface/getEmployeeRequest", output = "http://employee.webservice.rohit.com/EmployeeInterface/getEmployeeResponse")
    public Employee getEmployee(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns com.rohit.webservice.employee.EmployeeArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://employee.webservice.rohit.com/EmployeeInterface/getAllEmployeesRequest", output = "http://employee.webservice.rohit.com/EmployeeInterface/getAllEmployeesResponse")
    public EmployeeArray getAllEmployees();

    /**
     * 
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://employee.webservice.rohit.com/EmployeeInterface/downloadFileRequest", output = "http://employee.webservice.rohit.com/EmployeeInterface/downloadFileResponse")
    public byte[] downloadFile();

}