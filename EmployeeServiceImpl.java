package com.employee.EmployeeTask1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeTask1.entities.Employee;
import com.employee.EmployeeTask1.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getApplications() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		return employee;
	}

}
