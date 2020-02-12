package com.cg.ExpenseTracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ExpenseTracker.Model.Income;
import com.cg.ExpenseTracker.Model.User;
import com.cg.ExpenseTracker.Repo.IncomeRepo;
import com.cg.ExpenseTracker.Repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepo userRepo; // Creating reference of UserRepo using dependency injection

	@Autowired
	private IncomeRepo incomeRepo; // Creating reference of IncomeRepo Using Dependency Injection

	@Override
	public void saveUser(User user, int incomeId) {
		Income i = incomeRepo.findById(incomeId).get();

		if (i != null) {
			user.setIncome(i);
			userRepo.save(user);
		}

		else
			System.out.println("Income not present");

	}

	@Override
	public List<User> getAllUser() {
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User getUserById(int userId) {
		return userRepo.findById(userId).orElseThrow();
	}

	@Override
	public void updateUser(User user) {
		userRepo.save(user);

	}

	@Override
	public void deleteUserById(int userId) {
		userRepo.deleteById(userId);

	}

}
