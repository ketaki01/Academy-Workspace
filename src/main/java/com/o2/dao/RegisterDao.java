package com.o2.dao;

import com.o2.model.User;

public interface RegisterDao {
	
	public void saveRegistrationData(User user);

	public User checkIfRegistered(User user);

}
