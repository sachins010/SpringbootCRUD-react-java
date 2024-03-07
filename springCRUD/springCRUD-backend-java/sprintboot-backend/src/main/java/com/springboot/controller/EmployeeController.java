package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.repository.EmployeeRepository;

//@CrossOrigin(origins = "http://localhost:3000/")to give all permission of api i use "*" star over here

@CrossOrigin("*")
@RestController
@RequestMapping("/api/")
public class EmployeeController
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Rest API for to get all employees list
	@GetMapping("/employees")
	public List<Employee> getAllEmloyees()
	{
		return employeeRepository.findAll();
	}
}
