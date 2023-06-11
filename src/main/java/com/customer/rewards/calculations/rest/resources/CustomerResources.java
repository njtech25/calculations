/**
 * 
 */
package com.customer.rewards.calculations.rest.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.customer.rewards.calculations.exception.CustomerNotFoundException;
import com.customer.rewards.calculations.model.Customer;
import com.customer.rewards.calculations.repository.CustomerRepository;

/**
 * @author nitinjain
 *
 */
@RestController
public class CustomerResources {
	
	
	@Autowired
	CustomerRepository custRepoService;
	
	@GetMapping("/customers")
	List<Customer> getAllCustomers(){
		return custRepoService.findAll();
	}
	
	@GetMapping("/customers/{id}")
	Customer getCustomerById(@PathVariable int id){
		Customer retrieveCustomer=	custRepoService.findById(id);
		if(retrieveCustomer == null) {
			throw new CustomerNotFoundException("Customer Does n't Exist");
		}
		return custRepoService.findById(id);
	}
	
	
	@PostMapping("add/customers")
	ResponseEntity<Object> addCustomer(@Valid @RequestBody Customer newCustomer){
		 Customer savedCustomer = custRepoService.save(newCustomer);
		 URI loc =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
					buildAndExpand(savedCustomer.getId()).toUri();
		return ResponseEntity.created(loc).build();
	}
	
}
