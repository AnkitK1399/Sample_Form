package com.selenium.Model;

public class UserInfoDTO {
	
	private String Applicantname ="Ankit Kumar";
	private int Applicantmobile =91;
	private String Applicantemail;
	private int Applicantage = 00;
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
