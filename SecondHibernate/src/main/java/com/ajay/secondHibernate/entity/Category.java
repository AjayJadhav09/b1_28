package com.ajay.secondHibernate.entity;

public class Category {
	int id;
	String name;
	String description;
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
