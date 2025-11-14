package com.selenium.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.selenium.Model.Phone;

public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		Phone phoneNumber = new Phone();
		String[] mobileNumber = text.split("-");
		if(text.indexOf('-') == -1) {
			phoneNumber.setCountrycode("91");
			phoneNumber.setMobileNumber(mobileNumber[0]);
		}else {
			phoneNumber.setCountrycode(mobileNumber[0]);
			phoneNumber.setMobileNumber(mobileNumber[1]);
		}
		
		
		return phoneNumber;
		
	}

}
