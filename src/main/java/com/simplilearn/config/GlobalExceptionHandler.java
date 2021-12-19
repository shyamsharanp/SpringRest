package com.simplilearn.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Component
public class GlobalExceptionHandler {
	
		//application Level Handling
		@ExceptionHandler(value=ArithmeticException.class)
		@ResponseBody
		public String arithmeticExceptionHandler(ArithmeticException e) {
			return "Internal Error From Global Handler" + e.getMessage();
		}

}
