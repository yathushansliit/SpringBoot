package com.example.service;

import java.util.List;

import com.example.model.Allocation;

public interface AllocationService {
	    Allocation createAllocation(Allocation allocation);

	    List<Allocation> fetchAllAlocations();

	    Allocation fetchAllocation(int id);

	    List<Allocation> fetchEmployee(int empid);


}
