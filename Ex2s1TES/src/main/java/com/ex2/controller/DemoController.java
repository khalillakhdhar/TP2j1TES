package com.ex2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex2.model.Calcule;

@RestController
public class DemoController {

	@GetMapping("/fact")
	@ResponseBody
	String facto(@RequestParam(defaultValue = "1") String a)
	{
		Calcule cl=new Calcule();
		return "la factoriel de "+a+ " est "+cl.factoriel(Integer.parseInt(a));
		
		
	}
	
	
}
