package com.rohit.main;

import java.io.FileOutputStream;
import java.util.List;

import com.rohit.webservice.employee.Employee;
import com.rohit.webservice.employee.EmployeeImpService;
import com.rohit.webservice.employee.EmployeeInterface;
import com.rohit.webservice.salary.SalaryImpService;
import com.rohit.webservice.salary.SalaryInterface;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		
		EmployeeImpService employeeImpService = new EmployeeImpService();
		EmployeeInterface employeeInterface = employeeImpService.getEmployeeImpPort();
		
		SalaryImpService salaryImpService = new SalaryImpService();
		SalaryInterface salaryInterface = salaryImpService.getSalaryImpPort();
		
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Rohit");
		employee1.setLastName("Anand");
		employee1.setDesgination("Technical Architect");
		employee1.setRole("Full Stack Enginner");
		
		Employee employee2 = new Employee();
		employee2.setFirstName("Rajat");
		employee2.setLastName("Goel");
		employee2.setDesgination("Technical Architect");
		employee2.setRole("Full Stack Enginner");
		
		System.out.println("Adding Employee Logic : ---->");
		
		String employeeId1 = employeeInterface.addEmployee(employee1);
		System.out.println("Employee Id 1 : " + employeeId1);
		String employeeId2 = employeeInterface.addEmployee(employee2);
		System.out.println("Employee Id 2 : " + employeeId2);
		
		System.out.println("Adding Employee Logic : ---->");
		
		
		System.out.println("Add Salary for employees : ---->");
		
		salaryInterface.salary(employeeId1, 20000);
		salaryInterface.salary(employeeId1, 10000);
		salaryInterface.salary(employeeId2, 30000);
		salaryInterface.salary(employeeId2, 20000);
		
		System.out.println("Add Salary for employees : ---->");
		
		
		
		System.out.println("Get all employees with  total salary : ---->");
		
		List<Employee> employees = employeeInterface.getAllEmployees().getItem();
		
		for(Employee emp: employees) {
			System.out.println(emp.getFirstName() +  " " + emp.getLastName() 
			 + " " + emp.getDesgination() + " " + emp.getRole() 
			 + " " + salaryInterface.getTotalSalary(emp.getId()));
		}
		
		System.out.println("Get all employees with  total salary : ---->");
		
		
		System.out.println("Delete Employee 2 : ---->");
		
		employeeInterface.deleteEmployee(employeeId2);
		
		System.out.println("Delete Employee 2 : ---->");
		
		System.out.println("Get all employees with  total salary : ---->");
		
		employees = employeeInterface.getAllEmployees().getItem();
		
		for(Employee emp: employees) {
			System.out.println(emp.getFirstName() +  " " + emp.getLastName() 
			 + " " + emp.getDesgination() + " " + emp.getRole() 
			 + " " + salaryInterface.getTotalSalary(emp.getId()));
		}
		
		System.out.println("Get all employees with  total salary : ---->");
		
		System.out.println("Download File : --->");
		
		byte[] bytes = employeeInterface.downloadFile();
		FileOutputStream fos = new FileOutputStream("/Users/loanframe/Desktop/test.pdf");
		fos.write(bytes);
		fos.flush();
		fos.close();
		System.out.println("Download File : --->");
	}

}
