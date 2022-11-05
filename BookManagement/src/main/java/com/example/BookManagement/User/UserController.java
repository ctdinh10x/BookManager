package com.example.BookManagement.User;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	private UserDAO userDAO = new UserDAO();
	
	@PostMapping("/user/save")
	public String addUser(Model model,User user) throws SQLException {
		String error = userDAO.insertUser(user);
		model.addAttribute("error", error);
		return "redirect:/book/SignUp";
	}
}
