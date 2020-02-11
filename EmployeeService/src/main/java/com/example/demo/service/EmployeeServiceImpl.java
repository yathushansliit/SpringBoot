package com.example.demo.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Allocation;
import com.example.demo.model.Employee;
import com.example.demo.model.Telephone;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService   {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	 @Bean
	 RestTemplate getRestTemplate() {
	       return new RestTemplate();
	 }

	 @Autowired
	 RestTemplate restTemplate;
	    
	    
	    

	@Override
	public Employee createEmployee(Employee employee) {
		
		for(Telephone telephone:employee.getTelephones()) {
			telephone.setEmployee(employee);
		}
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee.orElse(null);
	}
	
	   public Employee fetchEmployee(int id) {
		   HttpHeaders httpHeaders = new HttpHeaders();
		    HttpEntity<String> httpEntity = new HttpEntity<>("", httpHeaders);
	        Optional<Employee> optional = employeeRepository.findById(id);
	        if (optional.isPresent()) {

	            Employee employee = optional.get();

	            ResponseEntity<Allocation[]> responseEntity = restTemplate.exchange("http://localhost:9191/allo_service/fetch_f_emp/" + id, HttpMethod.POST, httpEntity, Allocation[].class);

	            employee.setAllocations(responseEntity.getBody());

	            return employee;
	        } else {
	            return null;
	        }
	    }
	
	

}
