package com.o2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.o2.dao.RegisterDao;
import com.o2.model.User;

@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	RegisterDao registerDao;

	public void saveRegistrationData(User user) {
		registerDao.saveRegistrationData(user);
	}

	public User checkIfRegistered(User user) {
		return registerDao.checkIfRegistered(user);
	}
}
