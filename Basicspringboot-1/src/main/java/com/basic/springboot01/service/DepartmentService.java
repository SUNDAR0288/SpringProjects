package com.basic.springboot01.service;

import java.util.List;

import com.basic.springboot01.entity.Department;

public interface DepartmentService {

	public Department saveDapartment(Department department);

	public  List<Department> fetchDepartmentlist();

	public Department fetchDepartmentById(Long departmentId);

	public void deleteDepartmentById(long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

	

}
