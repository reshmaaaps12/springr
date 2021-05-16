package com.springr.springr.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springr.springr.dao.EmployeeDao;
import com.springr.springr.entity.Employee;

@Service
public class EmployeeServicesImpl implements EmployeeServices{

	
	@Autowired
	private EmployeeDao employeeDao;
//	List<employee> list;
	public EmployeeServicesImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(145,"Java Core Course","this course contains basics  java"));
//		list.add(new Course(4343,"Spring boot Course","creating rest api using spring boot"));
	}
	
	@Override
	public List<Employee> getEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(long employeeId) {
//		Course c=null;
//		for (Course course:list) {
//			if (course.getId()==courseId) {
//				c=course;
//				break;
//			}
//			
//		}
		return employeeDao.getOne(employeeId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
//		list.add(employee);
		employeeDao.save(employee);
		return employee;
	}

	

}
