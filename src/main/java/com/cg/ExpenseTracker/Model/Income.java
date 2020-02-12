package com.cg.ExpenseTracker.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

@Entity
public class Income {

	@Id
	@Column(name = "income_Id")
	private int incomeId;
	@Column(name = "monthly_income")
	private double monthlyIncome;
	@Column(name = "date")
	@Pattern(regexp = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", message = "Enter Date in MM/DD/YY")
	private String date;

	@OneToOne(mappedBy = "income") // One to One Mapping with Income Table
	private User user;

	/**
	 * @return the incomeId
	 */
	public int getIncomeId() {
		return incomeId;
	}

	/**
	 * @param incomeId the incomeId to set
	 */
	public void setIncomeId(int incomeId) {
		this.incomeId = incomeId;
	}

	/**
	 * @return the monthlyIncome
	 */
	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	/**
	 * @param monthlyIncome the monthlyIncome to set
	 */
	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
