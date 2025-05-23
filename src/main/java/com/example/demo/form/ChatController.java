package com.example.demo.form;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.ChatDao;
import com.example.demo.entity.EntForm;

@Controller
public class ChatController {

	@RequestMapping("/hello")
	public String Form(Model model) {
		model.addAttribute("message", "【Chat】へようこそ！");
		return "form/index";

	}

	@RequestMapping("/view")
	public String View(Model model, Chat chat) {
		model.addAttribute("message", "【Chatルーム】");
		List<EntForm> list = chatdao.searchDb();
		model.addAttribute("dbList",list);
		return "form/view";
		
	}


	private final ChatDao chatdao;
	public ChatController(ChatDao chatdao) {
		this.chatdao = chatdao;

	}

	@RequestMapping("/complete")
	public String complete(Chat chat, Model model) {
		model.addAttribute("message", "【Chatルーム】");
		EntForm entform = new EntForm();
		entform.setName(chat.getName());
		entform.setComment(chat.getComment());
		chatdao.insertDb(entform);
		List<EntForm> list = chatdao.searchDb();
		model.addAttribute("dbList",list);
		System.out.println(chat.getName());
		System.out.println(chat.getComment());
		return "form/view";
	}
}