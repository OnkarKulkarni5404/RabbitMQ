package com.persistent.emp.dao;

import java.util.List;

import com.persistent.emp.Beans.Employee;

public interface IEmployee {

	public Employee getEmployeeById(String empid);
	public List<Employee> getAllEmpl();
	public void Insert(Employee obj);
	public void Update(Employee obj) throws UserNotFoundException;
	public void Delete(Employee obj);

}
