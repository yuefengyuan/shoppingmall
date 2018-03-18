package com.fege.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {

	//private Logger logger = LoggerFactory.getLogger(GreetingController.class);

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Dear1");

		return "greeting";
	}
}
