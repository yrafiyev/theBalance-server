package com.theBalance.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.theBalance.entity.Expense;

@Repository
public class ExpenseDAOImpl implements ExpenseDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Expense> getExpenses() {
		Session session = sessionFactory.getCurrentSession();
		
		List<Expense> expenses = session.createQuery("from Expense order by date", Expense.class).getResultList();
		
		return expenses;
	}

	@Override
	public void saveExpense(Expense expense) {
		Session session = sessionFactory.getCurrentSession();
		session.save(expense);
	}

}
