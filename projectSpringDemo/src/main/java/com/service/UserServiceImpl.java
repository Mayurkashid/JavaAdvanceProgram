package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserRepository;
import com.model.User;

@Service
public class UserServiceImpl implements UserServiceInterface
{
	@Autowired
	UserRepository userRepo;

	@Override
	public User insertData(User u) 
	{
		
		return userRepo.save(u);
	}

}
