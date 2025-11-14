package com.selenium.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.selenium.Model.Email;

public class EmailFormatter implements Formatter<Email> {

	@Override
	public String print(Email object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Email parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		Email emailId = new Email();
		 String[] emailArray = text.split("@");
		 emailId.setUserName(emailArray[0]);
		 emailId.setCompanyMail(emailArray[1]);
		 return emailId;
	}

}
