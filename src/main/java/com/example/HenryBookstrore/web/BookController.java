package com.example.HenryBookstrore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	@RequestMapping("/index")
	public String viewBooks() {
		return "";
	}
	
	
}
