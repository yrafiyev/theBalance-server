package com.theBalance.dao;

import java.util.List;

import com.theBalance.entity.Expense;

public interface ExpenseDAO {
	public List<Expense> getExpenses();
	
	public void saveExpense(Expense expense);
}
