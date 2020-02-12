package com.cg.ExpenseTracker.Service;

import java.util.List;

import com.cg.ExpenseTracker.Model.Expense;

public interface ExpenseService {
	void saveExpense(Expense expense, int userId); // save expense

	List<Expense> getAllExpense(); // list all the expenses

	Expense getExpenseById(int userId); // finds expense by expense id

	void updateExpense(Expense expense); // update expense

	void deleteExpenseById(int userId); // delete expense by expense id

}
