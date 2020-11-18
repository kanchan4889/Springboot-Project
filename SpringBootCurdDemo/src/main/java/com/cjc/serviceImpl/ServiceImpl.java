package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.DaoInterface;
import com.cjc.model.User;
import com.cjc.service.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface
{
	@Autowired
	private DaoInterface dao;
	
	public User loginCheck(String uname, String password) 
	{
		return dao.findAllByUnameAndPassword(uname, password);
	}

	@Override
	public void deleteUser(int u) 
	{
		// TODO Auto-generated method stub
		 dao.deleteById(u);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return dao.save(user);
		
		
	}

	@Override
	public User EditUser(int RadioId) {
		// TODO Auto-generated method stub
		return dao.findAllByUid(RadioId);
	}

	@Override
	public User UpdateUser(User user) {
		
		return dao.save(user);
	}
	

}
