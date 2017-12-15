package com.o2.restcontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.o2.dao.RegisterDaoImpl;
import com.o2.model.User;

@RestController
public class UserInfoRest {
	
	@Autowired
	RegisterDaoImpl registerDaoImpl;
	
	 
@RequestMapping("/allUser")	
public ArrayList<User> test()
{
	ArrayList<User> userinfo=new ArrayList<User>();
	userinfo=registerDaoImpl.getAllUserInfo();
//	System.out.println("rest controller");
	userinfo=registerDaoImpl.getAllUserInfo();
//	System.out.println("rest controller 2" + userinfo);
	return userinfo;
}
}