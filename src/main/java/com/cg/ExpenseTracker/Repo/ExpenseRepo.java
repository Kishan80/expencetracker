package com.cg.ExpenseTracker.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ExpenseTracker.Model.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense, Integer> { // interface extending crud
																		// repository for crud operation

}
