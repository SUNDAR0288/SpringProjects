package com.basic.springboot01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basic.springboot01.entity.Department;

@Repository
public interface DeparmentRepository extends JpaRepository<Department, Long>{

	public Department findByDepartmentName(String departmentName);
	
	public Department findByDepartmentNameIgnoreCase(String departmentName);
}
