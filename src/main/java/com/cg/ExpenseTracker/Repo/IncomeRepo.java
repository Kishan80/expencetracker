package com.cg.ExpenseTracker.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ExpenseTracker.Model.Income;

@Repository
public interface IncomeRepo extends CrudRepository<Income, Integer> { // interface extending crud
																		// repository for crud operation

}
