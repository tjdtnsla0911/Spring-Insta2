package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository {

	public List<User> userList();
	public User findByUsername(String username);
}
