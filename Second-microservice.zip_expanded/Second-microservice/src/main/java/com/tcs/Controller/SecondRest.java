package com.tcs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("second-api")

public class SecondRest {
	
	//@Autowired
	//private RestTemplate restTemplate;
	
	@Autowired
	private Client fiegn;
	
	
	@GetMapping
	public String hello()
	
	{
		
		//String msg = restTemplate.getForObject("http://HELLO-FIRST-MS/first-api",String.class);
		String msg = fiegn.callingHello();
		return "Second Microservice got :" +msg;
	}
	
	@GetMapping("stmts")
	public ResponseEntity<Object> fetchStatements(){
		//Transaction tx = restTemplate.getForObject("http://HELLO-FIRST-MS/first-api/statements",Transaction.class);
		Transaction tx = fiegn.callingFetchStatements();
		
		
		Wallet wallet = new Wallet();
		
		wallet.setWalletNumber(tx.getAccountNumber());
		wallet.setAmount(wallet.getAmount() + tx.getAmount());
		return ResponseEntity.status(200).body(wallet);
	}
	

}
