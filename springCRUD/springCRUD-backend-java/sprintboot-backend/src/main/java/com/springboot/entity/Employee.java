package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="First_name")
	private String firstName;
	
	@Column(name="Last_name")
	private String lastName;
	
	@Column(name="Email_id")
	private String emailid;
	
	public Employee()// default constructor
	{
		
	}
	
	public Employee(String firstName, String lastName, String emailid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailid = emailid;
	}
	// whenever we create parameteries constructor we need to create default constructor
	// because hibernate internally uses proxies to create proxy objects
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
}
