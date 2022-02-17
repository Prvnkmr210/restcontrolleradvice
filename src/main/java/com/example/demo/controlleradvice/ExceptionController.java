package com.example.demo.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.BuzzException;
import com.example.demo.exception.CustomErrorResponse;
import com.example.demo.exception.FizzBuzzException;
import com.example.demo.exception.FizzException;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value= {FizzException.class})
	public ResponseEntity<CustomErrorResponse> fizz(FizzException ex){
		System.out.println(ex);
//		return new ResponseEntity<FizzException>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		
		CustomErrorResponse resp = new CustomErrorResponse(ex.getMessage(), ex.getErrorCode());
		return new ResponseEntity<CustomErrorResponse>(resp, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value= {BuzzException.class})
	public ResponseEntity<CustomErrorResponse> buzz(BuzzException ex){;
		
		CustomErrorResponse resp = new CustomErrorResponse(ex.getMessage(), ex.getErrorCode());
		return new ResponseEntity<CustomErrorResponse>(resp, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value= {FizzBuzzException.class})
	public ResponseEntity<CustomErrorResponse> fizzbuzz(FizzBuzzException ex){
		
		CustomErrorResponse resp = new CustomErrorResponse(ex.getMessage(), ex.getErrorCode());
		return new ResponseEntity<CustomErrorResponse>(resp, HttpStatus.INSUFFICIENT_STORAGE);
	}

}
