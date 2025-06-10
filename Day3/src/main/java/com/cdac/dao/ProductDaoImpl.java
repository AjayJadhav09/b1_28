package com.cdac.dao;

import java.sql.Statement;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;

import com.cdac.connection.DriverConnection;
import com.cdac.constants.ShoppingAppConstants;
import com.cdac.pojo.Product;


public class ProductDaoImpl implements ProductDao {

	@Override
	public Iterator<Product> getProduct() throws IOException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection conn =  DriverConnection.getConnection();
		Statement productStatement = conn.createStatement();
		ResultSet productResult = productStatement.executeQuery(ShoppingAppConstants.GETPRODUCTQUERY);
		
		List<Product> listProduct = new ArrayList<>();
		Product obj = null;
		
		while(productResult.next()) {
			obj = new Product();
			obj.setCategoryId(productResult.getInt("categoryId"));
			obj.setProductDesc(productResult.getString("productDesc"));
			obj.setProductPrice(productResult.getFloat("productPrice"));
			obj.setProductImageUrl(productResult.getString("productImageUrl"));
			listProduct.add(obj);
		}
		
		if(productResult != null) {
			productResult.close();
		}
		if(productStatement != null) {
			productStatement.close();
		}
		
		if(conn != null) {
			conn.close();
		}
		
		
		
		return listProduct.iterator();
	}

}
