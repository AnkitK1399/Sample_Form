package com.selenium.Model;

public class Email {
	
	private String userName;
	private String companyMail;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCompanyMail() {
		return companyMail;
	}
	public void setCompanyMail(String companyMail) {
		this.companyMail = companyMail;
	}
	@Override
	public String toString() {
		return getUserName()+getCompanyMail();
	}
	
}
