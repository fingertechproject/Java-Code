package com.employee.EmployeeTask1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	
	@Id
	private long id;
	@Column
	private String fName;
	@Column
	private String phone;
	@Column
	private String department;
	@Column
	private String email;
	@Column
	private String hEducation;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String gethEducation() {
		return hEducation;
	}



	public void sethEducation(String hEducation) {
		this.hEducation = hEducation;
	}



	public Employee(long id, String fName, String phone, String department, String email, String hEducation) {
		super();
		this.id = id;
		this.fName = fName;
		this.phone = phone;
		this.department = department;
		this.email = email;
		this.hEducation = hEducation;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", phone=" + phone + ", department=" + department
				+ ", email=" + email + ", hEducation=" + hEducation + "]";
	}
	
	

}
