package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.User;
import com.cjc.service.ServiceInterface;

@RestController
@RequestMapping(value="/rest")
public class WebService {

	@Autowired
	ServiceInterface service;
	
	@RequestMapping(value="/reg" , method=RequestMethod.POST)
	public ResponseEntity<User > regi(@RequestBody User user)
	{
		System.out.println("register");
		service.addUser(user);
		return new ResponseEntity<User>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/get" , method=RequestMethod.POST)
	public ResponseEntity<User> get(@RequestBody User user)
	{
		System.out.println("get user");
		User u=service.get( user);
		System.out.println(user);
		return new ResponseEntity(u,HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public ResponseEntity<User> delete(@RequestBody User id){
		
		System.out.println("delete user");
		service.deleteUser(id);
		return new ResponseEntity<User>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/getAll" , method=RequestMethod.GET)
	public ResponseEntity getAll(){
		
		System.out.println("getAll");
		List<User> list=service.getAll();
	
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.PUT)
	public ResponseEntity<User> edit(@RequestBody User id){
		System.out.println("update user");
		service.updateUser(id);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
}
