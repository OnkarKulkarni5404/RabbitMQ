package com.persistent.cafe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.cafe.dao.CafeDaoImpl;

@Service
public class EmpService {

	@Autowired
	private CafeDaoImpl dao;
	
	public void IncreaseCount() {
	dao.IncreaseCount();	
	}
	public void DecreaseCount() {
		dao.DecreaseCount();
	}
	
}
