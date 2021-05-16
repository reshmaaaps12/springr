package com.springr.springr.services;

import java.util.List;

import com.springr.springr.entity.Employee;

public interface EmployeeServices {

	public List<Employee> getEmployees();
	public Employee getEmployee(long empId);
	public Employee addEmployee(Employee employee);
	
}
