package com.pixeltrice.springbootactuatorapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {
 
	@GetMapping("/welcome")  
	public String hello()   
	{  
	return "Hello welcome to Spring Actuator!";  
	}  
	  
}
