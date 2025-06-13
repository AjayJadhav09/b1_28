package com.ajay.secondHibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
@NamedQueries({
	@NamedQuery(name="getAllCategories",query ="Select OBJECT(oCat) from Category oCat"),
	@NamedQuery(name="getCategoryById", query ="Select OBJECT(oCat) from Category oCat where oCat.id=:cid")
})
@NamedNativeQueries({
	@NamedNativeQuery(name="sqlAllCategories" , query = "Select * from category")
})
public class Category {
	@Id
	@Column(name="id")
	@GeneratedValue(generator="increment")
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="description")
	String description;
	
	@Column(name="imageurl")
	String imageUrl;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public Category(int id, String name, String description, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
	}
	public Category() {
		super();
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", imageUrl=" + imageUrl
				+ "]";
	}
	
	
}
