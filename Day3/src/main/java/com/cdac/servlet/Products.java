package com.cdac.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;

import com.cdac.dao.ProductDao;
import com.cdac.dao.ProductDaoImpl;
import com.cdac.pojo.Product;

/**
 * Servlet implementation class Products
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		ProductDao obj = new ProductDaoImpl();
		Iterator<Product> listProduct = null;
		
		try {
			listProduct = obj.getProduct();
		}catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		out.println("<div style=\"display: flex; justify-content: center; text-align: center; margin-top: 15%;\">\r\n"
				+ "        <table border=\"1\" style='border-collapse:collapse;'>\r\n"
				+ "            <thead>\r\n"
				+ "                <tr>\r\n"
				+ "                    <td>ID</td>\r\n"
				+ "                    <td>Name</td>\r\n"
				+ "                    <td>Description</td>\r\n"
				+ "                    <td>Image</td>\r\n"
				+ "                </tr>\r\n"
				+ "            </thead>\r\n"
				+ "            <tbody>\r\n"
				);
		
		
		listProduct.forEachRemaining(product ->{
			out.println("<tr>");
			out.println("<td>" + product.getCategoryId() + "</td>");
			out.println("<td>" + product.getProductDesc() + "</td>");
			out.println("<td>" + product.getProductPrice() + "</td>");
			out.println("<td> <a href='#'><img src='Images/" + product.getProductImageUrl() + "' style='height:50px'/></a></td>");
			out.println("</tr>");
		});
		
		out.println("</tbody>\r\n"
				+ "</table>\r\n"
				+ "</div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
