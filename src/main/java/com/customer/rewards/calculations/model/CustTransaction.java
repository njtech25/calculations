/**
 * 
 */
package com.customer.rewards.calculations.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author nitinjain
 *
 */

@Entity
@Table(name = "custtransaction")
public class CustTransaction {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	@Column(name="amount", columnDefinition="Decimal(10,2)")
	int amount;
	String date;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public CustTransaction() {
		// TODO Auto-generated constructor stub
	}
	public CustTransaction(int ammount, String date) {
		super();
		this.amount = ammount;
		this.date = date;
	}
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Customer customer;

}
