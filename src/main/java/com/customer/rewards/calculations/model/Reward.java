/**
 * 
 */
package com.customer.rewards.calculations.model;

/**
 * @author nitinjain
 *
 */

public class Reward {
	//CustTransaction custTransactions;
	String rewards;
	String month;

	@Override
	public String toString() {
		return "Reward [rewards=" + rewards + "]";
	}

	public String getRewards() {
		return rewards;
	}

	public void setRewards(String rewards) {
		this.rewards = rewards;
	}

	public Reward(String rewards) {
		this.rewards=rewards;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}



	
	

}
