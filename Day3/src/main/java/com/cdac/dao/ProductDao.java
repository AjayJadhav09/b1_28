package com.cdac.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;

import com.cdac.pojo.Product;

public interface ProductDao {
	public Iterator<Product> getProduct() throws IOException, SQLException,ClassNotFoundException;
}
