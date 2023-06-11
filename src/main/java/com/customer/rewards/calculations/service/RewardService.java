/**
 * 
 */
package com.customer.rewards.calculations.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.rewards.calculations.model.CustTransaction;
import com.customer.rewards.calculations.model.Customer;
import com.customer.rewards.calculations.model.DisplayCustRewardSummary;
import com.customer.rewards.calculations.repository.CustTransactionRepository;

/**
 * @author nitinjain
 *
 */
@Component
public class RewardService {

	@Autowired
	CustTransactionRepository custTranRepo;
	int grandTotalRewards = 0;
	DisplayCustRewardSummary displayRewards = new DisplayCustRewardSummary();
	Customer cust = new Customer();

	public DisplayCustRewardSummary getCustomerTransactions(int custId) {
		cust.setId(custId);
		displayRewards.setCustomer(cust);
		return mapToDisplayObject(custTranRepo.findByCustomerId(custId));

	}

	public DisplayCustRewardSummary getCustomerTransactionsByName(String custName) {
		cust.setName(custName);
		displayRewards.setCustomer(cust);
		return mapToDisplayObject(custTranRepo.findByCustomerNameIgnoreCase(custName));

	}

	private DisplayCustRewardSummary mapToDisplayObject(List<CustTransaction> custTranList) {

		displayRewards.settranactionsRecords(custTranList);
		displayRewards.setrewardsSummaryByMonth(calculateMonthlyRewards(custTranList));
		displayRewards.setTotalRewardsPoints(grandTotalRewards);

		return displayRewards;

	}

	private Map<String, Integer> getRewardSummaryMap(List<CustTransaction> cusTransList) {

		Map<String, Integer> monthlySummRewardMap = new HashMap<String, Integer>();

		for (CustTransaction custRec : cusTransList) {
			String monthKey = (LocalDate.parse(custRec.getDate()).getMonth()).toString();
			Integer oldValue = monthlySummRewardMap.get(monthKey) != null ? monthlySummRewardMap.get(monthKey) : 0;
			monthlySummRewardMap.put(monthKey, oldValue + custRec.getAmount());
		}
		return monthlySummRewardMap;

	}

	private Map<String, Integer> calculateMonthlyRewards(List<CustTransaction> cusTransList) {
		Map<String, Integer> monthlySummRewardMap = new HashMap<String, Integer>();
		Map<String, Integer> monthlyTransactionSumary = getRewardSummaryMap(cusTransList);

		for (Map.Entry<String, Integer> entry : monthlyTransactionSumary.entrySet()) {
			int monthTransValue = entry.getValue();
			int monthRewards = 0;
			if (monthTransValue > 100) {
				monthRewards = (monthTransValue - 100) * 2 + 50;
			}
			monthlySummRewardMap.put(entry.getKey(), monthRewards);
		}

		grandTotalRewards = monthlySummRewardMap.values().stream().mapToInt(tot -> tot).sum();

		return monthlySummRewardMap;
	}

}
