package com.cjc.service;

import java.util.List;

import com.cjc.model.User;

public interface ServiceInterface {

	public void addUser(User user);

	public User get(User user);
	
	public List<User> getAll();
	
	public void deleteUser(User id);

	public void updateUser(User user);

}
