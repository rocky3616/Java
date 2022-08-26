package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;
import com.example.demo.Service.UserServiceImpl;
import com.example.demo.entity.User;

@RestController
public class UserController {
	@Autowired
	UserService us;
	
	
	@PostMapping("/save")
	ResponseEntity<User> saveEntiy(@RequestBody User user)
	{
		return new ResponseEntity<User>(us.saveUser(user),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getuser")
	public List<User> getUsers()
	{
		return us.getAllUser();
	}
	
	@GetMapping("/getuserbyid/{id}")
	ResponseEntity<User> getUserById(@PathVariable("id") int  id)
	{
		
		return new ResponseEntity<User>(us.getUserById(id),HttpStatus.OK);
	}
	@PutMapping("/updatebyid/{id}")
	ResponseEntity<User> updateById(@PathVariable("id") int  id,@RequestBody User user)
	{
		return new ResponseEntity<User>(us.updateByUserId(user, id),HttpStatus.OK); 
	}
	@DeleteMapping("/deletebyid/{id}")
	ResponseEntity<User> deleteById(@PathVariable("id") int id)
	{
		return new ResponseEntity<User>(us.DeleteById(id),HttpStatus.OK);
		
	}
	
	@GetMapping("/name/{name}")
	public List<User> getUserByNames(@PathVariable("name") String name)
	{
		return us.selectByName(name);
	}
	
	

}
