package com.manage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.model.StuData;

public interface StuDataRepository extends JpaRepository<StuData,Long> {
	
	List<StuData>findByName(String name);
	List<StuData>findByCourse(String course);

}
