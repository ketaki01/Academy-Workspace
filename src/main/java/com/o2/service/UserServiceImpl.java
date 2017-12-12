package com.o2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o2.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	public String findUserByUsername(String username, String password) {
		return userDao.findUserByUsername(username,password);
	}

}
