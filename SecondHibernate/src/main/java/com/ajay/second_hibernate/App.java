package com.ajay.second_hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ajay.secondHibernate.entity.Category;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration hiberConfiguration = null;
		SessionFactory hiberFactory = null;
		Session hiberSession = null;
		
		try {
			hiberConfiguration = new Configuration();
			hiberConfiguration.configure("second.cfg.xml");
			hiberFactory = hiberConfiguration.buildSessionFactory();
			hiberSession = hiberFactory.openSession();
			
			Query<Category> query = hiberSession.createQuery("from Category",Category.class);
			List<Category> allCategories = query.getResultList();
			
			Iterator<Category> it = allCategories.iterator();
			
			while(it.hasNext()) {
				Category obj = it.next();
				System.out.println(obj);
			}
		}finally {
			if(hiberSession != null)
				hiberSession.close();
			if(hiberFactory != null)
				hiberFactory.close();
		}
	}

}
