package com.sb.SpringBootWelcomePageType1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String loginMessage(){
		return "login";
	}
}
