package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

public interface UserService  {
	
	//inserting user details in table
	User saveUser(User user); 
	
	//fetching all user details from table 
	List<User> getAllUser();
	
	//modifying user details from table based on id 
	User updateByUserId(User user,int id);
	//fetching user details from table by id
	User getUserById(int id);
	//deleting user from table using id
	User DeleteById(int id);
	
	List<User> selectByName(String uName);

}
