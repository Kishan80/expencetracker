package com.cg.ExpenseTracker.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table()
public class User {

	@Id
	@Column(name = "user_id")
	private int userId;
	@Column(name = "name")
	@Pattern(regexp="^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",message="Please enter full name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "email_id")
	@Pattern(regexp="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",message ="Enter valid email id")
	private String emailId;
	@Column(name = "phone_number")
	@Pattern(regexp="[7-9][0-9]{9}",message="phone number should be 10 digit")
	private String phoneNumber;

	@OneToOne(cascade = CascadeType.ALL) // One to One Mapping with Income Table
	@JoinColumn(name = "income_Id")
	private Income income;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user") // One to Many Mapping
																						// with Expense table
	private List<Expense> expense = new ArrayList<>();

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the income
	 */
	public Income getIncome() {
		return income;
	}

	/**
	 * @param income the income to set
	 */
	public void setIncome(Income income) {
		this.income = income;
	}

	/**
	 * @return the expense
	 */
	public List<Expense> getExpense() {
		return expense;
	}

	/**
	 * @param expense the expense to set
	 */
	public void setExpense(List<Expense> expense) {
		this.expense = expense;
	}

}
