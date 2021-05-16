package com.rn.dao;

import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rn.entities.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public User addUser(User user) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(user);
		
		transaction.commit();
		session.close();
		
		return user;
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public ResultSet viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object[]> verifyUser(String email, String username, String password) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(User.class);
		
		//create Projection objects
		Projection pro1=Projections.property("email");
		Projection pro2=Projections.property("username");
		Projection pro3=Projections.property("password");
				
		//create ProjectionList
		ProjectionList prolist=Projections.projectionList();
				
		//add the Projection objects to prolist
		prolist.add(pro1); prolist.add(pro2); prolist.add(pro3);
				
		//set Projection
		criteria.setProjection(prolist);
				
		//fetch the attributes
		List<Object[]> list=criteria.list();
		
		/*
		for(Object[] obarray: list) {
			for(Object ob: obarray) {
				System.out.println(ob);
			}
		}
		*/
		
		session.close();
		
		return list;
	}
	
}
