package com.cg.ExpenseTracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ExpenseTracker.Model.Expense;
import com.cg.ExpenseTracker.Model.User;
import com.cg.ExpenseTracker.Repo.ExpenseRepo;
import com.cg.ExpenseTracker.Repo.UserRepo;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	public ExpenseRepo expenceRepo; // Creating reference of ExpenseRepo using Dependency injection

	@Autowired
	public UserRepo userRepo; // Creating reference of UserRepo using Dependency injection

	@Override
	public void saveExpense(Expense expense, int userId) {
		User u = userRepo.findById(userId).get();

		if (u != null) {
			expense.setUser(u);
			expenceRepo.save(expense);
		}

		else
			System.out.println("User not present");

	}

	@Override
	public List<Expense> getAllExpense() {
		return (List<Expense>) expenceRepo.findAll();
	}

	@Override
	public Expense getExpenseById(int userId) {
		return expenceRepo.findById(userId).orElseThrow();
	}

	@Override
	public void updateExpense(Expense expense) {
		expenceRepo.save(expense);

	}

	@Override
	public void deleteExpenseById(int userId) {

		expenceRepo.deleteById(userId);
		;

	}

}
