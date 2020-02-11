package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.model.Project;
import com.example.demo.model.Telephone;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/service")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value ="/employees", method = RequestMethod.POST)
	public Employee storeEmployee(@RequestBody Employee employee) {
		
		for(Telephone telephone:employee.getTelephones()) {
			telephone.setEmployee(employee);
		}
		
		
		return employeeService.createEmployee(employee);
	}

	
	@RequestMapping("/fetch")
	public Employee getAll() {
		
			Employee employee = new Employee();
			employee.setName("yathushan");
			employee.setCity("colombo");
			
			Address address =new Address();
			address.setCity("jaffna");
			
			List<Telephone> telephones = new ArrayList<Telephone>();
			Telephone telephone = new Telephone();
			telephone.setNumber("0774579991");
			telephones.add(telephone);
			
			List<Project> projects = new ArrayList<Project>();
			Project project = new Project();
			project.setProjNameString("projChitty");
			projects.add(project);
			
			return employee;
		
	}
	
	

}
