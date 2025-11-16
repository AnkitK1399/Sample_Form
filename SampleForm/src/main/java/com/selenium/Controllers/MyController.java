package com.selenium.Controllers;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.Model.UserInfoDTO;

import jakarta.validation.Valid;

@Controller
public class MyController {

	@RequestMapping("/")
	public String formFill(Model model) {
		model.addAttribute("UserInfo", new UserInfoDTO());
		return "Home-page";
	}

	@RequestMapping("/register")
	public String resultDisplay(@Valid @ModelAttribute("UserInfo") UserInfoDTO user, BindingResult result) {
		System.out.println(user.getApplicantname());
		if (result.hasErrors()) {
			return "Home-page";
		} else {
			return "form-display";
		}
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		System.out.println("Hello");
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, "Applicantname", editor);

	}

}