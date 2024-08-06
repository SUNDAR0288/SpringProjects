package com.basic.springboot01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;
	
	@NotBlank(message = "Please Add Department Name")
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public Department(long departmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [deparmentId=" + departmentId + ", deparmentName=" + departmentName + ", departmentAddress="
				+ departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
	
	
}
