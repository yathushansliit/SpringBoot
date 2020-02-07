package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/service")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/hello")
	public String greeting() {
		return "Hello";
	}
	
	@RequestMapping(value = "/employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}

}