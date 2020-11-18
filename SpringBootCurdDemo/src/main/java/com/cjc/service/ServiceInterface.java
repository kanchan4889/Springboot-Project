package com.cjc.service;

import java.util.List;

import com.cjc.model.User;



public interface ServiceInterface {
	
	public User loginCheck(String name,String pass);
	public User addUser(User user);
	public void deleteUser(int u);
	public User EditUser(int RadioId);
	
	public User UpdateUser(User user);


}
