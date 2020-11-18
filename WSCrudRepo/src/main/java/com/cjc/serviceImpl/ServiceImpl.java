package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.DaoInterface;
import com.cjc.model.User;
import com.cjc.service.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface{

	@Autowired
	DaoInterface dao;
	
	@Override
	public void addUser(User user) {
		dao.save(user);
		
	}

	@Override
	public User get(User user) {
		User list=dao.findAllByUnameAndPassword(user.getUname(),user.getPassword());
		return list;
	}

	@Override
	public void deleteUser(User id) {
		
		dao.deleteById(id.getId());
	}
	
	public List<User> getAll() {
		
		List<User> list=(List<User>) dao.findAll();
		return list;
	}

	@Override
	public void updateUser(User user) {
		System.out.println(user.getId());
		int id=user.getId();
		dao.findAllById(id);
		dao.save(user);
	}

	
}
