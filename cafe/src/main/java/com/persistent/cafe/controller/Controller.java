package com.persistent.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.cafe.service.EmpService;

@RestController
public class Controller {

	@Autowired
	private EmpService service;
	
	@GetMapping("/")
	void print()
	{
		System.out.println("hello world");
	}
	
	@PostMapping("/increase")
	void post()
	{
		service.IncreaseCount();
	}
	
	@PostMapping("/delete")
	void delete()
	{
		service.DecreaseCount();
	}

	
}
