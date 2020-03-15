package com.persistent.emp.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="Employee")
public class Employee {
	
	@Id
	private String empid;
	@Column
	private String EmpName;
	@Column
	private String contactno;
	
	public Employee() {
		super();
	}
	
	public Employee(String empid, String empName, String contactno) {
		super();
		this.empid = empid;
		EmpName = empName;
		this.contactno = contactno;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
}
