package com.emr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emr.model.Class;
@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {
	
}
