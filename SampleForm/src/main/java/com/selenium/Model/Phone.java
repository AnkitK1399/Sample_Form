package com.selenium.Model;

import jakarta.validation.constraints.Size;

public class Phone {
	
	private String Countrycode;
	@Size(min=10,max=10,message="Mobile Number should be of 10 digit")
	private String MobileNumber;
	public String getCountrycode() {
		return Countrycode;
	}
	public void setCountrycode(String countrycode) {
		Countrycode = countrycode;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return getCountrycode()+"-"+getMobileNumber();
	}
	
}
