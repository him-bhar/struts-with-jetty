package com.himanshu.struts.action;

import java.util.List;

public class TestOGNLValue {
	private List<String> message;
	public List<String> getMessage() {
		return message;
	}

	public void setMessage(List<String> message) {
		this.message = message;
	}

	public String getInputView() {
		System.out.println("Inside input view");
		return "test-ognl-input";
		
	}
	
	public String getInputs() {
		System.out.println("Output values are: "+message);
		return "test-ognl-output";
	}
	
}
