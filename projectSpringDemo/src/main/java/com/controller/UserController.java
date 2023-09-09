package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserServiceInterface;


@RestController
public class UserController
{
	@Autowired
	UserServiceInterface userService;
	
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User u) 
	{
		
		return userService.insertData(u);
	}

}
