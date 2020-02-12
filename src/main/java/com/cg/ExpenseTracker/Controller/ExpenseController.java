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

import com.cg.ExpenseTracker.Model.Expense;
import com.cg.ExpenseTracker.Service.ExpenseService;

@RestController
public class ExpenseController {

	@Autowired
	public ExpenseService expenseService; // Creating Reference of ExpenseService using dependency injection

	// To Post and Get data using HTTP request 

	@PostMapping(value = "/addExpense/{userId}", consumes = "application/json")
	public String saveExpense(@Valid @PathVariable int userId, @RequestBody Expense expense) {
		expenseService.saveExpense(expense, userId);
		return "Expense saved";
	}

	@GetMapping(value = "/getAllExpense", produces = "application/json")
	public List<Expense> getAllExpense() {
		return expenseService.getAllExpense();
	}

	@GetMapping(value = "/getExpense/{userId}", produces = "application/json")
	public Expense getExpenseById(@PathVariable int userId) {
		return expenseService.getExpenseById(userId);

	}

	@PutMapping(value = "/updateExpense", consumes = "application/json")
	public String update(@Valid @RequestBody Expense expense) {
		expenseService.updateExpense(expense);
		return "Expense updated";
	}

	@DeleteMapping(value = "/deleteExpense/{userId}")
	public void deleteExpenseById(@PathVariable int userId) {
		expenseService.deleteExpenseById(userId);
	}

}
