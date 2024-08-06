package com.basic.springboot01.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.basic.springboot01.entity.Department;
import com.basic.springboot01.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {

	
	@Autowired
	private DepartmentService departmentservice;
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("Inside saveDepartment of DepartmentController");
		return departmentservice.saveDapartment(department);
		
	}
	
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentlist(){
		LOGGER.info("Inside fetchDepartmentlist of DepartmentController");
		return departmentservice.fetchDepartmentlist();
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentservice.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentservice.deleteDepartmentById(departmentId);
		return "Department deleted successfully";
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId, 
										@RequestBody Department department) {
		return departmentservice.updateDepartment(departmentId, department);
		
	}
	
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentservice.fetchDepartmentByName(departmentName);
	}
}
