package com.company;

public class Email {

	public String from;
	public String to;
	public String message;
	
	public Email() {
		
	}
	
	
	public Email(String from, String to, String message) {
		super();
		this.from = from;
		this.to = to;
		this.message = message;
	}
	
	public int charactersInMessage(){
		return message.length();
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
