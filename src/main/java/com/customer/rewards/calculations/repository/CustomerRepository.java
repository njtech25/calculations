package com.customer.rewards.calculations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.rewards.calculations.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	Customer findByName(String name);
	//Customer findById(int id);
	
	

}
