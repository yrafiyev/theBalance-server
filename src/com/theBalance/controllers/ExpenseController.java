package com.theBalance.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.theBalance.entity.Expense;
import com.theBalance.service.DbService;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {
	
	@Autowired
	private DbService db;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/list")
	public @ResponseBody List<Expense> listExpenses() {
		return db.getExpenses();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/save")
	public void saveExpense(@RequestBody Expense expense) {
		db.saveExpense(expense);
	}
	
}
