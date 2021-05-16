package com.springr.springr.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springr.springr.entity.Employee;
import com.springr.springr.services.EmployeeServices;

@RestController
public class MyController {

	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("/home")
	public String home() {
		return "welcome to employee data";
	}
	
	//get the courses
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return this.employeeServices.getEmployees();
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable String empId) {
		return this.employeeServices.getEmployee(Long.parseLong(empId));
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeServices.addEmployee(employee);
	}
	
	
}
