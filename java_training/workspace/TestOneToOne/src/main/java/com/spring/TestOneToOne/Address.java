package com.spring.TestOneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="addrId")
	private Long addrId;
	
	@Column(name="street")
	private String street;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String state, String country) {
		super();
		this.street = street;
		this.state = state;
		this.country = country;
	}

	public Address(Long addrId, String street, String state, String country) {
		super();
		this.addrId = addrId;
		this.street = street;
		this.state = state;
		this.country = country;
	}

	public Long getAddrId() {
		return addrId;
	}

	public void setAddrId(Long addrId) {
		this.addrId = addrId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", street=" + street + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
