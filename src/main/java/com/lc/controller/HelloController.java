package com.lc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lc.base.model.User;
import com.lc.model.Demo;
import com.lc.service.DemoService;
import com.lc.service.UserService;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	UserService userService;
	
	@Autowired
	DemoService demoService;


	@GetMapping()
	public String sayHello() {
		User user = new User();
		System.out.println("hello");
		user.setPassword("password");
		user.setUsername("username");
		userService.addUser(user);
		return "Hello";
	}
	
	@PostMapping()
	public String hello() {
		System.out.println("SUEECESS");
		return "hello";
	}
	
	
	@GetMapping("/demo")
	public String sayDemo() {
		//return "SUCEESSDEMO";
		return demoService.addDemo();
	}
	
	
	
}
