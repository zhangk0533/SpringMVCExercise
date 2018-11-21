package com.zhangk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	private String city;
	private int id;
	private String street;
	public Address() {
	
	}
	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public String getStreet() {
		return street;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
	
	
	

}
