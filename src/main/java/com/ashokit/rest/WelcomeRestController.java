package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.service.WelcomeService;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private WelcomeService welcomeService;
	
	public ResponseEntity<String> welcome(){
		System.out.println(welcomeService.getClass().getName());
		String responseMsg = welcomeService.getWelcomeMSg();
		responseMsg=responseMsg.toUpperCase();
		return new ResponseEntity<>(responseMsg,HttpStatus.OK);
	}

}
