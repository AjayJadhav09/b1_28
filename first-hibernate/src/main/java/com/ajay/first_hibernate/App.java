package com.ajay.first_hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.ajay.first_hibernate.entity.User;


public class App {
	
	
	public static void main(String[] args) {
		Configuration hiberConfiguration = null;
		SessionFactory hiberFactory = null;
		Session hibernateSession = null;
		
		try {
			hiberConfiguration = new Configuration();
			hiberConfiguration.configure("databaseConfig.cfg.xml");
			hiberFactory = hiberConfiguration.buildSessionFactory();
			hibernateSession = hiberFactory.openSession();
			
			try(Scanner sc = new Scanner(System.in)){
//				System.out.println("Enter the username");
//				String userName = sc.next();
//				
//				System.out.println("Enter the password");
//				String password = sc.next();
//				
//				System.out.println("Enter the name");
//				String name = sc.next();
//				
//				System.out.println("Enter the email");
//				String email = sc.next();
//				
//				User objUser = new User(userName,password,name,email);
				
				hibernateSession.beginTransaction();
//				hibernateSession.persist(objUser);
				User user1 = (User) hibernateSession.get(User.class,"user101@cdac.com");
			//	 User uss = hibernateSession.load(User.class,"ajjjjjj");
//				 if(user1 != null) {
//					 hibernateSession.remove(user1);
//					 System.out.println("Deleted");
//				 }else {
//					 System.out.println("not found");
//				 }
				user1.setName("Ajay");
				hibernateSession.merge(user1);
//				
				hibernateSession.getTransaction().commit();
				
				//System.out.println("User Registered");
			}catch(Exception e){
				e.printStackTrace();
			}
		}finally {
			if(hibernateSession != null) {
				hibernateSession.close();
			}
			if(hiberFactory != null) {
				hiberFactory.close();
			}
		}
	}
}
