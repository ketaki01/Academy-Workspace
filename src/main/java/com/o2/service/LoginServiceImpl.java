package com.o2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o2.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao loginDao;
	
	public String findUserByUsername(String associateId, String password) {
		return loginDao.findUserByUsername(associateId,password);
	}

}
