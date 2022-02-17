package com.example.demo.dto;

public enum ExceptionEnum {
	
	FizzException("fizz"),
	BuzzException("buzz"),
	FizzBuzzException("fizzbuzz");


	private String type;

	ExceptionEnum(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

}
