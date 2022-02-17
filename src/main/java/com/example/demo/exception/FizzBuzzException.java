package com.example.demo.exception;

public class FizzBuzzException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String message;
	private String errorCode;
	
	public FizzBuzzException(String message, String errorCode) {
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
