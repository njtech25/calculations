package com.customer.rewards.calculations.model;

import java.util.List;
import java.util.Map;

public class DisplayCustRewardSummary {
	
	Customer customer;
	Map<String,Integer> rewardsSummaryByMonth;
	int totalRewardsPoints;
	List<CustTransaction> tranactionsRecords;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getTotalRewardsPoints() {
		return totalRewardsPoints;
	}
	public void setTotalRewardsPoints(int totalRewardsPoints) {
		this.totalRewardsPoints = totalRewardsPoints;
	}
	public List<CustTransaction> gettranactionsRecords() {
		return tranactionsRecords;
	}
	public void settranactionsRecords(List<CustTransaction> tranList) {
		this.tranactionsRecords = tranList;
	}
	public Map<String, Integer> getrewardsSummaryByMonth() {
		return rewardsSummaryByMonth;
	}
	public void setrewardsSummaryByMonth(Map<String, Integer> rewardsSummaryByMonth) {
		this.rewardsSummaryByMonth = rewardsSummaryByMonth;
	}

	

}
