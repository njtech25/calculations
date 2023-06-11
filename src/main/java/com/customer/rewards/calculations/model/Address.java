/**
 * 
 */
package com.customer.rewards.calculations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nitinjain
 *
 */
@Entity
@Table(name = "address")
public class Address {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	String id;
	@JsonProperty("Address Line1")
	String addrLine1;
	@JsonProperty("Address Line2")
	String addrLine2;
	String city;
	String zipCode;
	String country;
	public Address(String id, String addrLine1, String addrLine2, String city, String zipCode, String country) {
		super();
		this.id = id;
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}
	public Address() {

	}
	
}
