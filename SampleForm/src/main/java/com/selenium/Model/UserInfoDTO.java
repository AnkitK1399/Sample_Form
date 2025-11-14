package com.selenium.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = "Name should not be blank")
	@Size(min = 5, max = 20, message = "Your name should have character between 5 - 15")
	private String Applicantname;
	private int Applicantmobile;
	private String Applicantemail;
	private int Applicantage;
	public String getApplicantname() {
		return Applicantname;
	}
	public void setApplicantname(String applicantname) {
		Applicantname = applicantname;
	}
	public int getApplicantmobile() {
		return Applicantmobile;
	}
	public void setApplicantmobile(int applicantmobile) {
		Applicantmobile = applicantmobile;
	}
	public String getApplicantemail() {
		return Applicantemail;
	}
	public void setApplicantemail(String applicantemail) {
		Applicantemail = applicantemail;
	}
	public int getApplicantage() {
		return Applicantage;
	}
	public void setApplicantage(int applicantage) {
		Applicantage = applicantage;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [Applicantname=" + Applicantname + ", Applicantmobile=" + Applicantmobile
				+ ", Applicantemail=" + Applicantemail + ", Applicantage=" + Applicantage + "]";
	}
	

}