package com.persistent.emp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.emp.Beans.Employee;
import com.persistent.emp.service.EmployeeService;



@RestController
public class Controller {
	
	@Autowired 
	public EmployeeService service;
	
	@GetMapping("/hello")
	String printit()
	{
		return "Hello World";
	}
	
	@GetMapping("/")
	List<Employee> getemp()
	{
		return service.getAllEmpl();
	}
	
	@PostMapping("/")
	void insert(@RequestBody Employee emp)
	{
		service.Insert(emp);
		System.out.println("Inserted Employee");
	}
	
	@DeleteMapping("/")
	void delete(@RequestBody Employee emp)
	{
		service.Delete(emp);
		System.out.println("Employee Deleted");
	}
	
}
