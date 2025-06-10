package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		try (Connection dbconnection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/advbatch_1", "root","cdac" );
		Scanner sc = new Scanner(System.in);
				PreparedStatement register = dbconnection.prepareStatement(
					    "INSERT INTO users (username, password, name, email, city) VALUES (?, ?, ?, ?, ?)"))

			
		{
		System.out.println("Connection Successfull");
		
		System.out.println("Enter the Username");
		String username = sc.next();
		
		System.out.println("Enter the password");
		String password = sc.next();
		
		System.out.println("Enter the name");
		String name = sc.next();
		
		System.out.println("Enter the email");
		String email = sc.next();
		
		System.out.println("Enter the city");
		String city = sc.next();
	
		register.setString(1, username);
		register.setString(2, password);
		register.setString(3, name);
		register.setString(4, email);
		register.setString(5, city);
		
		register.executeUpdate();
		System.out.println("User Added to Database Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

