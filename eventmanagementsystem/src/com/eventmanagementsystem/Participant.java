package com.eventmanagementsystem;

public class Participant extends EventManagement {
	
	private String emailId;
	private boolean checkIin;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public boolean isCheckIin() {
		return checkIin;
	}
	public void setCheckIin(boolean checkIin) {
		this.checkIin = checkIin;
	}

	
}
