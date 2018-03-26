package com.ege.learn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

	//private Logger logger = LoggerFactory.getLogger(GreetingController.class);

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Dear1");

		return "greeting";
	}
}
