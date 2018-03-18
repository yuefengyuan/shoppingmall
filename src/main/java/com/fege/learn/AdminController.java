package com.fege.learn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/login")
	public String login(Model model) {

		model.addAttribute("projectName","shoppingMall");

		return "login";
	}
}
