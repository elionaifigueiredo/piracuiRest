package com.piracui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/index")
public class ControllerAplicativo {

	@GetMapping("/ola")
	public String hello(){
		return "Olá Mundo";
	}
	
}
