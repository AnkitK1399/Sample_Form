package com.selenium.Model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = "Name should not be blank")
	@Size(min = 5, max = 20, message = "Your name should have character between 5 - 15")
	private String Applicantname;
	@Valid
	private CommunicationDTO communicationDTO;
	private int Applicantage;
	public String getApplicantname() {
		return Applicantname;
	}
	public void setApplicantname(String applicantname) {
		Applicantname = applicantname;
	}
	
	
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	public int getApplicantage() {
		return Applicantage;
	}
	public void setApplicantage(int applicantage) {
		Applicantage = applicantage;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [Applicantname=" + Applicantname + ", communicationDTO=" + communicationDTO
				+ ", Applicantage=" + Applicantage + "]";
	}
	
	

}