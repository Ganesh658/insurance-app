package com.example.springwebex.service;

import java.util.List;

import com.example.springwebex.model.User1;

public interface LoginService {

	public boolean validateUser(String username, String password, String purpose);

	public User1 save(User1 user1);

	public List<User1> getAllUserDetails();

	public int deleteUserDetailsById(Long id);
}
