package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;
	//saving user details using JpaRepository save method
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	//fetching all user details from table
	@Override
	public List<User> getAllUser() {
		
		return repo.findAll();
	}
//find by id if not present will an exception
	@Override
	public User updateByUserId(User user, int id) {
		User existUser=repo.findById(id).orElseThrow(()-> new UserNotFoundException("user not found"));
		
		existUser.setEmail(user.getEmail());
		existUser.setUserPhone(user.getUserPhone());
		repo.save(existUser);
		return existUser;
	}
	//find by id if not present will an exception
	@Override
	public User getUserById(int id) {
		
		
		return repo.findById(id).orElseThrow(()-> new UserNotFoundException("user not found"));
	}

	@Override
	public User DeleteById(int id) {
		repo.findById(id).orElseThrow(()-> new UserNotFoundException("user not found"));
		repo.deleteById(id);
		return null;
	}

	@Override
	public List<User> selectByName(String uName) {
		// TODO Auto-generated method stub
		return repo.selectByName(uName);
	}

}
