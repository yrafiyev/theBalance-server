package com.theBalance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.theBalance.dao.ExpenseDAO;
import com.theBalance.dao.UserDAO;
import com.theBalance.entity.Expense;
import com.theBalance.entity.User;

@Service
public class DbServiceImpl implements DbService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private ExpenseDAO expenseDAO;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}
	
	@Override
	@Transactional
	public void saveExpense(Expense expense) {
		expenseDAO.saveExpense(expense);
	}
	
	@Override
	@Transactional
	public void saveUser(User user) {
		userDAO.saveUser(user);
	}
	
	@Override
	@Transactional
	public List<Expense> getExpenses() {
		return expenseDAO.getExpenses();
	}
}
