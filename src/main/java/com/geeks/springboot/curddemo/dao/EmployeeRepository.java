package com.geeks.springboot.curddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geeks.springboot.curddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   
	// that's it .... no need to write any code LOL!
}
