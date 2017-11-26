package com.theBalance.service;

import java.util.List;

import com.theBalance.entity.Expense;
import com.theBalance.entity.User;

public interface DbService {
	public List<User> getUsers();
	public void saveExpense(Expense expense);
	public void saveUser(User user);
	public List<Expense> getExpenses();
}
