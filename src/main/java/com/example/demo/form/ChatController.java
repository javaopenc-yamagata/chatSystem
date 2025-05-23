package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
	
	/*@RequestMapping("/hello")
		public String Hello(Model model) {
		model.addAttribute("message", "【Chat】へようこそ！");
		return "sample";
	}*/
	
	@RequestMapping("/hello")
	public String Form(Model model) {
		model.addAttribute("message", "【Chat】へようこそ！");
		return "form/index";
		
	}
	
	@RequestMapping("/form")
	public String Confirm(Model model, Chat chat) {
		model.addAttribute("message","このように投稿しました！");
		return "form/view";
	}
	
	
}
