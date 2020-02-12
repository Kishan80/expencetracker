package com.cg.ExpenseTracker.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ExpenseTracker.Model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> { // interface extending crud
																	// repository for crud operation

}
