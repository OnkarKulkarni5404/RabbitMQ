package com.persistent.cafe.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

@Entity
public class Cafe {

	@Id
	private String id;
	@Column
	private int empcount;

	
	public Cafe() {}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getEmpcount() {
		return empcount;
	}


	public void setEmpcount(int empcount) {
		this.empcount = empcount;
	}
	
	public void incEmpCount()
	{
		this.empcount++;
	}
	
	public void decEmpCount()
	{
		this.empcount--;
	}


	public Cafe(String id, int empcount) {
		super();
		this.id = id;
		this.empcount = empcount;
	}


}
