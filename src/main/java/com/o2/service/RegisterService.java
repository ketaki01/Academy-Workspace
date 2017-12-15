package com.o2.service;

import com.o2.model.User;

public interface RegisterService {

	public void saveRegistrationData(User user);

	public User checkIfRegistered(User user);
}
