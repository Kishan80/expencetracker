package com.cg.ExpenseTracker.Service;

import java.util.List;

import com.cg.ExpenseTracker.Model.Income;

public interface IncomeService {

	void saveIncome(Income income); // save income

	List<Income> getAllIncome(); // list all the incomes

	Income getIncomeById(int userId); // finds income by id

	void updateIncome(Income income); // update income

	void deleteIncomeById(int userId); // delete income by id

}
