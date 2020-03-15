package com.persistent.emp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistent.emp.Beans.Employee;
import com.persistent.emp.Repo.EmployeeRepo;
import com.persistent.emp.queueproducer.QueueProducer;

@Repository
public class EmployeeDaoImpl implements IEmployee {

	@Autowired
	EmployeeRepo repo;

	@Autowired
	QueueProducer qp;

	@Override
	public Employee getEmployeeById(String empid) {
		Optional<Employee> emp = repo.findById(empid);
		try {
			if (emp.isPresent()) {
				return emp.get();
			} else {
				throw new UserNotFoundException("User not found with empid " + empid);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmpl() {
		return repo.findAll();
	}

	@Override
	public void Insert(Employee obj) {
		repo.save(obj);
		try {
			qp.produce("Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void Update(Employee obj) throws UserNotFoundException {
		Optional<Employee> emp = repo.findById(obj.getEmpid());
		if (!emp.isPresent()) {
			throw new UserNotFoundException("No User Exists " + obj.getEmpid());
		} else {
			repo.save(obj);
		}
	}

	@Override
	public void Delete(Employee obj) {
		if(repo.findById(obj.getEmpid()).isPresent())
		{
			repo.deleteById(obj.getEmpid());
			try {
				qp.produce("Deleted");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
