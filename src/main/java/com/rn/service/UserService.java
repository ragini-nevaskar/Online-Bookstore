package com.rn.service;

import java.sql.ResultSet;
import java.util.List;

import com.rn.entities.User;

public interface UserService {

	public User addUser(User user);
	public String deleteUser(User user);
	public ResultSet viewAllUsers();
	public int totalUsers();
	public List<Object[]> verifyUser(String email, String username, String password);
}
