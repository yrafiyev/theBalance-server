package com.theBalance.dao;

import java.util.List;

import com.theBalance.entity.User;


public interface UserDAO {
	public List<User> getUsers();

	public void saveUser(User user);
}
