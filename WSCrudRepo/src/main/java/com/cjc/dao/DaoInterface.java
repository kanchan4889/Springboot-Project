package com.cjc.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.User;

@Repository
public interface DaoInterface extends MongoRepository<User, Integer>{

	public User findAllByUnameAndPassword(String uname,String password);
	public User findAllById(int id);
}
