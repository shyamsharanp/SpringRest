package com.simplilearn.controller;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
	
	//File Level Handling
	/*
	 * @ExceptionHandler(value=ArithmeticException.class)
	 * 
	 * @ResponseBody public String arithmeticExceptionHandler() { return
	 * "Internal Error Occured"; }
	 */
	@GetMapping("/calculate")
	
	//@RequestMapping(value="/calculate", method=MethodType.GET)
	public Integer Calculate() {
		int a = 6;
		int b = 0;
		
		int result=a/b;
		
		return result;
		
	}

}
