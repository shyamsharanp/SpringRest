package com.simplilearn.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.models.Greet;

@RestController
public class RestControllerDemo {

	@RequestMapping(value="/greetme", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Greet greet() {
		Greet g = new Greet();
		g.setName("Dhruvik");
		g.setMessage("Hello world");
		return g;
	}
	
	@RequestMapping(value="/greetme", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Greet greet(@RequestParam("name") String name, @RequestParam("message") String message) {
		Greet g = new Greet();
		g.setName(name);
		g.setMessage(message);
		return g;
	}
}
