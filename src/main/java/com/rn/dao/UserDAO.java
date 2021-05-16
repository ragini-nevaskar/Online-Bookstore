package com.rn.dao;

import java.sql.ResultSet;
import java.util.List;

import com.rn.entities.User;

public interface UserDAO {

	public User addUser(User user);
	public void deleteUser(User user);
	public ResultSet viewAllUsers();
	public List<Object[]> verifyUser(String email, String username, String password);
}
