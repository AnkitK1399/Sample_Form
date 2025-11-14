package com.selenium.Model;

import jakarta.validation.Valid;

public class CommunicationDTO {
	
	private Email email;
	@Valid
	private Phone phone;
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CommunicationDTO [email=" + email + ", phone=" + phone + "]";
	}
	

}
