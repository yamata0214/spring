package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("message", "Hello SpringBoot");
		return "index";
	}
}
