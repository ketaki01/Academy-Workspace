package com.o2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.o2.controller.LoginController;
import com.o2.model.User;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	public static final String COLLECTION_NAME = "UserInfo";
	User output;

	public User checkIfRegistered(User user) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(user.getAssociateId()));
		output = mongoTemplate.findOne(query, User.class, COLLECTION_NAME);
//		System.out.println(output);
		return output;
	}

	public void saveRegistrationData(User user) {
		if(user.getPassword().equals(user.getConfirmPassword()))
		mongoTemplate.save(user, COLLECTION_NAME);
	}
    
    public ArrayList<User> getAllUserInfo() {
    	Query query = new Query();
//    	query.addCriteria(Criteria.where("name").is("Eric"));
    	List<User> userinfo=mongoTemplate.find(query,User.class,COLLECTION_NAME);
//    	System.out.println("UserInfo"+userinfo);
    	return (ArrayList<User>) userinfo;
    }

}
