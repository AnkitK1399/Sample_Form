package com.selenium.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.Model.UserInfoDTO;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String formFill(Model model) {
		model.addAttribute("UserInfo", new UserInfoDTO());
		return "Home-page";
	}
	
	@RequestMapping("/register")
	public String resultDisplay(@ModelAttribute("UserInfo")UserInfoDTO user) {
		return "form-display";
	}
}
