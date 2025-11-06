package com.selenium.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.Model.UserInfoDTO;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String formFill() {
		return "Home-page";
	}
	
	@RequestMapping("/register")
	public String resultDisplay(UserInfoDTO user, Model model) {
		model.addAttribute("users", user);
		return "form-display";
	}
}
