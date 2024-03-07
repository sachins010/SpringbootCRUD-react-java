package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	// Employee is class which imports here with id is interger
	
	// we no need to create methodes over here because JpaRepository alread contains all methods inside.
}
