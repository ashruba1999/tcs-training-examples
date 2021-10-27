package com.tcs.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("http://HELLO-FIRST-MS/first-api")
public interface Client {
	
	@GetMapping
	public String callingHello();
	
	@GetMapping("statements")
	public Transaction callingFetchStatements();

}
