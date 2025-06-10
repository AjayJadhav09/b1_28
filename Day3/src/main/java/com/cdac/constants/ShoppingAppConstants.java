package com.cdac.constants;

public class ShoppingAppConstants {
	public static final String URL = "jdbc:mysql://localhost:3306/USER";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "cdac";
	public static final String JDBCDRIVER = "com.mysql.cj.jdbc.Driver";
	
	public static final String AUTHENTICATEQUERY = "select name, password from user where name = ? and password = ?";
	public static final String GETCATEGORIESQUERY = "select * from category";
	public static final String GETPRODUCTQUERY = "select * from products";
	
	private ShoppingAppConstants() {
		
	}
	
}