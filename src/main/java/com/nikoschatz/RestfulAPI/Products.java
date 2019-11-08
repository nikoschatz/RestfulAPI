package com.nikoschatz.RestfulAPI;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "code", unique = true, nullable = false)
	private int code;
	
    @Column(name = "name", nullable = false, length = 100)
	private String name;
    
    @Column(name = "price", nullable = false)
	private float price;
    
	private String expiration_date;
	private String availability_date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	public String getAvailability_date() {
		return availability_date;
	}
	public void setAvailability_date(String availability_date) {
		this.availability_date = availability_date;
	}
	

}
