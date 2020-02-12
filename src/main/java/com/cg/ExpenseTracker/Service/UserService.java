package com.cg.ExpenseTracker.Service;

import java.util.List;

import com.cg.ExpenseTracker.Model.User;

public interface UserService {

	void saveUser(User user, int incomeId); // save the user

	List<User> getAllUser(); // List all the users

	User getUserById(int id); // finds user by id

	void updateUser(User user); // update user

	void deleteUserById(int id); // delete user by id

}
