/**
 * 
 */
package com.customer.rewards.calculations.rest.resources;

import java.util.Optional;

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
	

	@GetMapping(path = "/getRewards/name/{name}")
	public DisplayCustRewardSummary getCustomerRewardsByName(@PathVariable String name) {
		Customer retrieveCustomer=	custRepoService.findByName(name);
		if(retrieveCustomer == null) {
			throw new CustomerNotFoundException("Customer Does n't Exist");
		}
		return rewardService.getCustomerTransactionsByName(name);
	}
	
	@GetMapping(path = "/getRewards/{custId}")
	public  DisplayCustRewardSummary getCustomerRewardsById(@PathVariable int custId) {
		return rewardService.getCustomerTransactions(custId);
	}


}
