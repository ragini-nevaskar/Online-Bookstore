package com.rn.service;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rn.dao.UserDAO;
import com.rn.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;
	
	public User addUser(User user) {
		user=userDao.addUser(user);
		
		return user;
	}

	public String deleteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public int totalUsers() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Object[]> verifyUser(String email, String username, String password) {
		List<Object[]> list=userDao.verifyUser(email, username, password);
		
		return list;
	}

}
