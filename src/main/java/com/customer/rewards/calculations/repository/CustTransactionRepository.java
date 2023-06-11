package com.customer.rewards.calculations.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.rewards.calculations.model.CustTransaction;

public interface CustTransactionRepository extends JpaRepository<CustTransaction, Integer> {
	
	  List<CustTransaction> findByCustomerId(int id);
	  
	  List<CustTransaction> findByCustomerNameIgnoreCase(String Name);

}
