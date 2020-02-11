package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.model.Allocation;
import com.example.repository.AllocationRepository;


@Service
public class AllocationServiceImpl implements AllocationService{

	   @Autowired
	    AllocationRepository allocationRepository;
	   
	@Override
	public Allocation createAllocation(Allocation allocation) {
		// TODO Auto-generated method stub
		return allocationRepository.save(allocation);
	}

	@Override
	public List<Allocation> fetchAllAlocations() {
		// TODO Auto-generated method stub
		 return allocationRepository.findAll();
	}

	@Override
	public Allocation fetchAllocation(int id) {
		 Optional<Allocation> optional = allocationRepository.findById(id);
	        if (optional.isPresent())
	            return optional.get();
	            return null;
	}

	@Override
	public List<Allocation> fetchEmployee(int empid) {
		 Allocation allocation = new Allocation();
	        allocation.setEmpId(empid);

	        Example<Allocation> example = Example.of(allocation);

	        return allocationRepository.findAll(example);
	}
	
	

}
