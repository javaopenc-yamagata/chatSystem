package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
	
	@RequestMapping("/Hello")
		public String Hello(Model model) {
		model.addAttribute("message", "Hello!");
		return "sample";
	}
	
	
	
}
