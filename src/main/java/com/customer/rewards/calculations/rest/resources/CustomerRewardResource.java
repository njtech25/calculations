/**
 * 
 */
package com.customer.rewards.calculations.rest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customer.rewards.calculations.exception.CustomerNotFoundException;
import com.customer.rewards.calculations.model.Customer;
import com.customer.rewards.calculations.model.DisplayCustRewardSummary;
import com.customer.rewards.calculations.repository.CustomerRepository;
import com.customer.rewards.calculations.service.RewardService;

/**
 * @author nitinjain
 *
 */
@RestController
public class CustomerRewardResource {
	
	@Autowired
	RewardService rewardService;
	@Autowired
	CustomerRepository custRepoService;
	

	@GetMapping(path = "/rewards/name/{name}")
	public DisplayCustRewardSummary getCustomerRewardsByName(@PathVariable String name) {
		Customer retrieveCustomer=	custRepoService.findByNameIgnoreCase(name);
		if(retrieveCustomer == null) {
			throw new CustomerNotFoundException("Customer Does n't Exist");
		}
		return rewardService.getCustomerTransactionsByName(name);
	}
	
	@GetMapping(path = "/rewards/{custId}")
	public  DisplayCustRewardSummary getCustomerRewardsById(@PathVariable int custId) {
		Customer retrieveCustomer=	custRepoService.findById(custId);
		if(retrieveCustomer == null) {
			throw new CustomerNotFoundException("Customer Does n't Exist");
		}
		return rewardService.getCustomerTransactions(custId);
	}


}
