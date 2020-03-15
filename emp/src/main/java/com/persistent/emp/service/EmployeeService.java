package com.persistent.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.emp.Beans.Employee;
import com.persistent.emp.dao.EmployeeDaoImpl;
import com.persistent.emp.dao.UserNotFoundException;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDaoImpl dao;
	
	public Employee getEmployeeById(String empid) {
		return dao.getEmployeeById(empid);
	}
	public List<Employee> getAllEmpl(){
		return dao.getAllEmpl();
	}
	public void Insert(Employee obj)
	{
		dao.Insert(obj);
	}
	public void Update(Employee obj) throws UserNotFoundException{
		dao.Update(obj);	
	}
	public void Delete(Employee obj) {
		dao.Delete(obj);
	}
	
}
