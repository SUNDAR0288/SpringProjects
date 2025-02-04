package com.basic.springboot01.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.springboot01.entity.Department;
import com.basic.springboot01.repository.DeparmentRepository;

@Service
public class DepartmentServiceIMPL implements DepartmentService {

	
	@Autowired
	private DeparmentRepository departmentRepository;
	
	
	@Override
	public Department saveDapartment(Department department) {
		
		return departmentRepository.save(department);
	}


	@Override
	public List<Department> fetchDepartmentlist() {
		
		return departmentRepository.findAll();
	}


	@Override
	public Department fetchDepartmentById(Long departmentId) {
		
		return departmentRepository.findById(departmentId).get();
	}


	@Override
	public void deleteDepartmentById(long departmentId) {
		departmentRepository.deleteById(departmentId);
		
	}


	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		Department depDB = departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentName())&&
			!"".equalsIgnoreCase(department.getDepartmentName())){
			
			depDB.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDepartmentAddress())&&
				!"".equalsIgnoreCase(department.getDepartmentAddress())){
				
				depDB.setDepartmentAddress(department.getDepartmentAddress());
			}
		
		if(Objects.nonNull(department.getDepartmentCode())&&
				!"".equalsIgnoreCase(department.getDepartmentCode())){
				
				depDB.setDepartmentCode(department.getDepartmentCode());
			}
		return departmentRepository.save(depDB);
		
	}


	@Override
	public Department fetchDepartmentByName(String departmentName) {
		 
		return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
	}
	
	
	
	

}
