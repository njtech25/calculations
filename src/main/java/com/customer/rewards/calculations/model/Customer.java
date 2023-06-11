/**
 * 
 */
package com.customer.rewards.calculations.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nitinjain
 *
 */
@Entity
@Table(name = "customer")
public class Customer {
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + "]";
	}

	public Customer(int id, String name, LocalDate dob, Address address) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id;
	@JsonProperty("Customer Name")
	@Size(min = 2, message="Name length >= 2")
	@JsonInclude(Include.NON_NULL)
	String name;
	
	@Past(message ="Birth Date is not valid ")
	@JsonIgnore
	//@JsonProperty("Date Of Birth")
	LocalDate dob;
	
	@JsonProperty("Address")
    @OneToOne
    @JsonInclude(Include.NON_NULL)
	Address address;
	public Customer() {

	}
	

}
