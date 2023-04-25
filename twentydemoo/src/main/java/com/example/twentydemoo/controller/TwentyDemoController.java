package com.example.twentydemoo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwentyDemoController {

	@GetMapping("/Landingpage")
	public String landin(@RequestParam String username)
	{
		return "Landing post of the user "+username;
	}
}