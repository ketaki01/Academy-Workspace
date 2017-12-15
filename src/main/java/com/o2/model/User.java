package com.o2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	
	@Override
	public String toString() {
		return "User [associateId=" + associateId + ", name=" + name + ", role=" + role + ", email=" + email
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	@Id	
	private String associateId;
	private String name;	
	private String role;
	private String email;
	private String password;
	private String confirmPassword;
	
	//constructors
	public User(String name, String associateId, String role, String email, String password, String confirmPassword) {
		super();
		this.associateId = associateId;
		this.name = name;		
		this.role = role;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAssociateId() {
		return associateId;
	}
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
}
