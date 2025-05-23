package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
	
	@RequestMapping("/hello")
		public String Hello(Model model) {
		model.addAttribute("message", "Hello!");
		return "sample";
	}
	
	@RequestMapping("/form")
	public String Form(Model model) {
		return "form/index";
		
	}
	
	
}
