package com.persistent.cafe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistent.cafe.bean.Cafe;

@Repository
public interface Repo extends JpaRepository<Cafe,String> {

}
