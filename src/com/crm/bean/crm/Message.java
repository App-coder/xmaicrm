package com.crm.bean.crm;

public class Message {
	private boolean type;
	private String message;
	
	public Message(){
		
	}
	
	public Message(boolean type, String message) {
		super();
		this.type = type;
		this.message = message;
		
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
