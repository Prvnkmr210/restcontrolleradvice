package com.example.demo.exception;

public class CustomErrorResponse {
	
	private String message;
	private String errorCode;
	
	public CustomErrorResponse(String message, String errorCode) {
		this.message = message;
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public String getErrorCode() {
		return errorCode;
	}	

}
