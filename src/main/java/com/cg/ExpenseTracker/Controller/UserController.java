package com.cg.ExpenseTracker.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ExpenseTracker.Model.User;
import com.cg.ExpenseTracker.Service.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService userService; // Creating Reference of UserService using dependency injection

	// To Post and Get data using HTTP request and response

	@PostMapping(value = "/addUser/{incomeId}", consumes = "application/json")
	public String saveUser(@Valid @PathVariable int incomeId, @RequestBody User user) {
		userService.saveUser(user, incomeId);
		return "User saved";
	}

	@GetMapping(value = "/getAllUser", produces = "application/json")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@GetMapping(value = "/getUser/{userId}", produces = "application/json")
	public User getUserById(@PathVariable int userId) {
		return userService.getUserById(userId);

	}

	@PutMapping(value = "/updateUser", consumes = "application/json")
	public String updateUser(@Valid @RequestBody User user) {
		userService.updateUser(user);
		return "User updated";
	}

	@DeleteMapping(value = "/deleteUser/{userId}")
	public void deleteUser(@PathVariable int userId) {
		userService.deleteUserById(userId);
	}

}
