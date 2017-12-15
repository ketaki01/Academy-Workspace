package com.o2.dao;

public interface LoginDao {

	public String findUserByUsername(String username, String password);

}
