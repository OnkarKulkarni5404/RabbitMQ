package com.persistent.emp.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.persistent.emp.Beans.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String>{

}
