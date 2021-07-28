package com.samrat.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String Home()
	{
		return ("<h1>Welcome</h1>");
	}
	
	@GetMapping("/user")
	public String user()
	{
		return ("<h1>You are user</h1>");
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return ("<h1>You are admin</h1>");
	}
}
