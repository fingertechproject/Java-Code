package com.employee.EmployeeTask1.service;

import java.util.List;

import com.employee.EmployeeTask1.entities.Employee;



public interface EmployeeService {
	public List<Employee> getApplications();

	public Employee addEmployee(Employee employee);

}
