package com.cjc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.User;

@Repository
public interface DaoInterface extends CrudRepository<User, Integer>{
	
	//public void saveUser(User user);
	
	
	//public int loginCheck(User user);
	/*public int deleteUser(User user);
	public List<User> displayAll(User user);
	public User editUser(User user);
	public int updateUser(User user);*/

	public User findAllByUnameAndPassword(String uname,String password);
	public User findAllByUid(int id);
}
