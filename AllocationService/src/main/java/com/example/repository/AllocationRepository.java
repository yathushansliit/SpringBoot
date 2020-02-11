package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Allocation;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation,Integer>{

}
