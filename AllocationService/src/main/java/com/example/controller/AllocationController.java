package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Allocation;
import com.example.service.AllocationService;

@RestController
@RequestMapping("/allocationService")
public class AllocationController {
	
	  @Autowired
	    AllocationService allocationService;
	  
	  @RequestMapping("/set")
	    public Allocation setAllocation() {

	        Allocation allocation = new Allocation();
	        allocation.setId(1);
	        allocation.setEmpId(1);
	        allocation.setStart("2018");
	        allocation.setEnd("2020");
	        allocation.setProjectCode("ABC");

	        return allocation;

	    }
	  
	  @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public Allocation save(@RequestBody Allocation allocation) {
	        return allocationService.createAllocation(allocation);
	        }
	  
	  @RequestMapping("/fetchEmployee/{empid}")
	    public List<Allocation> fetchEmployee(@PathVariable int empid) {
	        return allocationService.fetchEmployee(empid);
	    }


}
