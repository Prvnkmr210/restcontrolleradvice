package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ExceptionEnum;
import com.example.demo.exception.BuzzException;
import com.example.demo.exception.FizzBuzzException;
import com.example.demo.exception.FizzException;

@RestController
public class GetController {
	// if class annotated with @Controller, it is a web API and it needs view resolver to display the result
	// @RestController - This is for Rest API and here view resolver is not required.
	// Rest controller contains below tags
//	@Target(value={TYPE})
//	@Controller
//	@ResponseBody
//	@Retention(value=RUNTIME)
//	@Documented
	
	@RequestMapping(value="/get/{code}", method = RequestMethod.GET)
	public ResponseEntity<String> getNames(@PathVariable(value="code") String cd) throws FizzException, BuzzException, FizzBuzzException {
		System.out.println(cd);
		
		if(ExceptionEnum.FizzException.getType().equals(cd)) {
			throw new FizzException("fizz exception", "500");
		}
		else if(ExceptionEnum.BuzzException.getType().equals(cd)) {
			throw new BuzzException("buzz exception", "400");
		}
		else if(ExceptionEnum.FizzBuzzException.getType().equals(cd)) {
			throw new FizzBuzzException("fizzbuzz exception", "507");
		}
		
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}

}
