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

import com.cg.ExpenseTracker.Model.Income;
import com.cg.ExpenseTracker.Service.IncomeService;

@RestController
public class IncomeController {

	@Autowired
	public IncomeService incomeService; // Creating Reference of IncomeService using Dependency injection

	// To Post and Get data using HTTP request and response

	@PostMapping(value = "/addIncome", consumes = "application/json")
	public String saveIncome(@Valid  @RequestBody Income income) {
		incomeService.saveIncome(income);
		return "Income saved";
	}

	@GetMapping(value = "/getAllIncome", produces = "application/json")
	public List<Income> getAllIncome() {
		return incomeService.getAllIncome();
	}

	@GetMapping(value = "/getIncome/{userId}", produces = "application/json")
	public Income getIncomeById(@PathVariable int userId) {
		return incomeService.getIncomeById(userId);

	}

	@PutMapping(value = "/updateIncome", consumes = "application/json")
	public String updateIncome(@Valid @RequestBody Income income) {
		incomeService.updateIncome(income);
		return "Income updated";
	}

	@DeleteMapping(value = "/deleteIncome/{userId}")
	public void deleteIncome(@PathVariable int userId) {
		incomeService.deleteIncomeById(userId);
	}

}
