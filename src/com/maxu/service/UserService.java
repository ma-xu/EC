package com.maxu.service;

import java.util.List;

import com.maxu.entity.User;

public interface UserService {

	public User getUser(String id);
	
	public List<User> getAllUser();
	
	public void addUser(User user);
	
	public boolean delUser(String id);
	
	public boolean updateUser(User user);
}
