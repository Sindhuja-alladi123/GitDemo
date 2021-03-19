package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column
	String id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String phone;
	@Column
	private String country;
	public Employee() {
		super();
	}
	public Employee(String id,String name, String email, String phone, String country) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.country = country;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
