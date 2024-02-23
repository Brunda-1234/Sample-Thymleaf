package com.te.thymleafproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.thymleafproject.entity.User;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		
		System.err.println("First get api --->  getControllerMethod");
		
		return "dummy";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user, Model model) {
		
		System.err.println("POstMethod");
		System.out.println(user.toString());
	
		//getting the model
		Model addAttribute = model.addAttribute("data",new User());
		
		System.err.println(addAttribute.toString());
		
		//return veiw by rendering with the thymleaf template
		return "dummy";
	}
}
