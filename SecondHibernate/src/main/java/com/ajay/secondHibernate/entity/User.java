package com.ajay.secondHibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="password")
	String password;
	
	@Column(name="email")
	String email;
	
	
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
	
	public User(int id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public User() {
		super();
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
	
	
}
