package com.assignment.dao;

import java.util.List;

import com.assignment.model.User;

public interface UserDao {

	Integer save(User user);
	   User get(Integer id);
	   List<User> list();
	   void update(Integer id, User user);
	   void delete(Integer id);
}
