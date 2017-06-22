package com.rohit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import com.rohit.dto.Employee;
import com.rohit.util.DBConnection;

public class DaoService {

	/**
	 * add employee
	 * 
	 * @param employee
	 * @return
	 */
	public static String addEmployee(Employee employee) {
		// TODO Auto-generated method stub

		Connection conn;
		PreparedStatement stmt;
		DBConnection dbConn = new DBConnection();
		String uniqueId = UUID.randomUUID().toString();
		int rows = 0;
		try {
			conn = dbConn.getDBConnection(); // get the data base connection
												// object
			
			stmt = conn.prepareStatement(
					"insert into employee (id, first_name, last_name, designation, role) values(?, ?, ?, ?, ?)");
			stmt.setString(1, uniqueId);
			stmt.setString(2, employee.getFirstName());
			stmt.setString(3, employee.getLastName());
			stmt.setString(4, employee.getDesgination());
			stmt.setString(5, employee.getRole());

			rows = stmt.executeUpdate();

			dbConn.closeConnection(); // close the database connection

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return rows == 1 ? uniqueId : "User not entered.";
	}

	/**
	 * get employee
	 * 
	 * @param id
	 * @return
	 */

	public static Employee getEmployee(String employeeId) {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement stmt;
		DBConnection dbConn = new DBConnection();
		Employee employee = null;

		try {
			conn = dbConn.getDBConnection(); // get the data base connection
												// object

			stmt = conn.prepareStatement("select * from employee where id = ?");
			stmt.setString(1, employeeId);

			ResultSet resultSet = stmt.executeQuery();

			while (resultSet.next()) {

				employee = new Employee();

				employee.setId(resultSet.getString("id"));
				employee.setFirstName(resultSet.getString("first_name"));
				employee.setLastName(resultSet.getString("last_name"));
				employee.setDesgination(resultSet.getString("designation"));
				employee.setRole(resultSet.getString("role"));
			}

			dbConn.closeConnection(); // close the database connection

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return employee;
	}

	/**
	 * delete employee
	 * 
	 * @param id
	 * @return
	 */

	public static boolean deleteEmployee(String employeeId) {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement stmt;
		DBConnection dbConn = new DBConnection();
		int rows = 0;

		try {
			conn = dbConn.getDBConnection(); // get the data base connection
												// object

			stmt = conn.prepareStatement("delete from employee where id = ?");
			stmt.setString(1, employeeId);

			rows = stmt.executeUpdate();

			dbConn.closeConnection(); // close the database connection

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return rows == 1 ? true : false;
	}

	/**
	 * get all employees
	 * 
	 * @return
	 */

	public static Employee[] getAllEmployees() {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement stmt;
		DBConnection dbConn = new DBConnection();
		Employee employee = null;
		List<Employee> listEmployees = new LinkedList<>();

		try {
			conn = dbConn.getDBConnection(); // get the data base connection
												// object

			stmt = conn.prepareStatement("select * from employee;");
			ResultSet resultSet = stmt.executeQuery();
			
			while (resultSet.next()) {

				employee = new Employee();

				employee.setId(resultSet.getString("id"));
				employee.setFirstName(resultSet.getString("first_name"));
				employee.setLastName(resultSet.getString("last_name"));
				employee.setDesgination(resultSet.getString("designation"));
				employee.setRole(resultSet.getString("role"));
				
				listEmployees.add(employee);
			}

			dbConn.closeConnection(); // close the database connection

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return listEmployees.toArray(new Employee[listEmployees.size()]);
	}

	/**
	 * method to add salary for employee
	 * 
	 * @param employeeId
	 * @param salary
	 * @return
	 */

	public static boolean addSalary(String employeeId, int salary) {

		Connection conn;
		PreparedStatement stmt;
		DBConnection dbConn = new DBConnection();
		int rows = 0;

		try {
			conn = dbConn.getDBConnection(); // get the data base connection
												// object

			stmt = conn.prepareStatement("insert into salary (employee_id, salary) values(?, ?)");
			stmt.setString(1, employeeId);
			stmt.setInt(2, salary);

			rows = stmt.executeUpdate();

			dbConn.closeConnection(); // close the database connection

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rows == 1;
	}

	/**
	 * get total salary for employee
	 * 
	 * @param employeeId
	 * @return
	 */

	public static Long getTotalSalary(String employeeId) {

		Connection conn;
		PreparedStatement stmt;
		DBConnection dbConn = new DBConnection();
		long sum = 0;

		try {
			conn = dbConn.getDBConnection(); // get the data base connection
												// object

			stmt = conn.prepareStatement("select sum(salary)  as totalSalary from salary where employee_id = ?");
			stmt.setString(1, employeeId);

			ResultSet resultSet = stmt.executeQuery();

			while (resultSet.next()) {
				sum = resultSet.getLong("totalSalary");
			}

			dbConn.closeConnection(); // close the database connection

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return sum;
	}

}
