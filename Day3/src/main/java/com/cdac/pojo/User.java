package com.cdac.pojo;


public class User {
	private String name;
	private String password;
	private String email;
	
	public User() {
		super();
	}
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
		this.email = null;
	}
	
	public User(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}