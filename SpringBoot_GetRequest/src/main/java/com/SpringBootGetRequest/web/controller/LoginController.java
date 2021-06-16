package com.SpringBootGetRequest.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	//Model
	
	// model is used to send data from controller to view part and the jsp captures and displays it to the user
	
	
	
	
		@RequestMapping("/login")
		public String loginMessage(@RequestParam String name, ModelMap model){
			model.put("name", name);
			return "login";
		}

}


/// http://localhost:8080/login?name=name whatever you want to provide