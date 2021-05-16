package com.springr.springr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springr.springr.entity.Employee;
public interface EmployeeDao extends JpaRepository<Employee,Long>{

	
}
