package com.o2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.o2.model.User;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	MongoTemplate mongoTemplate;
	public static final String COLLECTION_NAME = "UserInfo";

	public String findUserByUsername(String associateId, String password) {		
		String output= "";
		Query query=new Query();
		
		//ignore case
//		query.addCriteria(Criteria.where("username").regex(username, "i"));
		
		//code to fetch record
		
		query.addCriteria(Criteria.where("_id").is(associateId));		
		User result = (User) mongoTemplate.findOne(query, User.class, COLLECTION_NAME);

		//validate password
		if(result != null) {
			if(result.getPassword().equals(password)) {
			output= result.getName();
//			System.out.println(result);
			}
		}
		return output;		
		
	}

}
