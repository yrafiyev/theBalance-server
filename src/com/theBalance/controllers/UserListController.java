package com.theBalance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.theBalance.entity.User;
import com.theBalance.service.DbService;

@Controller
@RequestMapping("/users")
public class UserListController {
	
	@Autowired
	private DbService userService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/list")
	public String listUsers(Model theModel) {
		theModel.addAttribute("users", userService.getUsers());
		return "list-users";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/all")
	public @ResponseBody List<User> showUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/addUser")
	public String addUser(Model theModel) {
		User theUser = new User();
		
		theModel.addAttribute("user", theUser);
		
		return "user-form";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		
		userService.saveUser(user);
		
		return "redirect:/users/list";
	}
	
}
