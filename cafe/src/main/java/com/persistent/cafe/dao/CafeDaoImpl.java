package com.persistent.cafe.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistent.cafe.bean.Cafe;
import com.persistent.cafe.repo.Repo;

@Repository
public class CafeDaoImpl implements ICafeDao{

	@Autowired
	private Repo repo;
	
	
	@Override
	public void IncreaseCount() {
		Optional<Cafe> current_count=repo.findById("1");
		if(!current_count.isPresent())
		{
			repo.save(new Cafe("1",0));
			Optional<Cafe> temp=repo.findById("1");
			temp.get().incEmpCount();
			repo.save(temp.get());
			
			System.out.println("Inserted in cafe");
			
		}
		else
		{
			current_count.get().incEmpCount();
			repo.save(current_count.get());
		}
	}

	@Override
	public void DecreaseCount() {
		Optional<Cafe> current_count=repo.findById("1");
		if(!current_count.isPresent())
		{
			repo.save(new Cafe("1",0));
			Optional<Cafe> temp=repo.findById("1");
			temp.get().incEmpCount();
			repo.save(temp.get());
		}
		else
		{
			current_count.get().decEmpCount();
			repo.save(current_count.get());
		}
		
	}

	
	
	
}
