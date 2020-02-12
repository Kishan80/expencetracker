package com.cg.ExpenseTracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ExpenseTracker.Model.Income;
import com.cg.ExpenseTracker.Repo.IncomeRepo;

@Service
public class IncomeServiceImpl implements IncomeService {

	@Autowired
	public IncomeRepo incomeRepo; // Creating Reference of IncomeRepo using dependency injection

	@Override
	public void saveIncome(Income income) {
		incomeRepo.save(income);

	}

	@Override
	public List<Income> getAllIncome() {
		return (List<Income>) incomeRepo.findAll();
	}

	@Override
	public Income getIncomeById(int userId) {
		return incomeRepo.findById(userId).orElseThrow();
	}

	@Override
	public void updateIncome(Income income) {
		incomeRepo.save(income);

	}

	@Override
	public void deleteIncomeById(int userId) {
		incomeRepo.deleteById(userId);
	}

}
