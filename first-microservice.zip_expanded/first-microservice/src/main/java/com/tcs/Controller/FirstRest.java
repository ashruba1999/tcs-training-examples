package com.tcs.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.beans.Transaction;

@RestController
@RequestMapping("first-api")
public class FirstRest {
	
	@GetMapping
	public String hello()
	{
		return "Welcome to First Microservice ";
	}
	
	@GetMapping("statements")
	public Transaction fetchStatements() {
		Transaction tx = new Transaction(993324566777L,4456321987L,8000);
		return tx; 
	}

}
