package com.example;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BareController {

	@RequestMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("message", "Hello, World!");

		return "index.html";
	}

	@RequestMapping(value = "/update")
	public String update(Model model) {
		model.addAttribute("date", new Date());

		return "snippets/update.html";
	}

}
