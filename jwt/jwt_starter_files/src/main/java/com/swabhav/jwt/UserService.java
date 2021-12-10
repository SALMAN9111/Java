package com.swabhav.jwt;

import java.util.List;


public interface UserService {
	public UserModel addUser(UserModel user);
	public UserModel findUserByEmail(String email);
	public List<UserModel> findAll();
}
