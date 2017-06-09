package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController // This means that this class is a Controller
@RequestMapping(path = "/demo") // This means URL's start with /demo (after
								// Application path)
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/users")
	public List<User> getAllUsers() {
		return userService.getAllUers();
	}

	@GetMapping(path = "/users/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.getUserByid(id);
	}

	@PostMapping(path = "/users")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PostMapping(path = "/users/{id}")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@DeleteMapping(path = "/users/{id}")
	public String updateUser(@PathVariable Integer id) {
		return userService.deleteUser(id);
	}
	
}