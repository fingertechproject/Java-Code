package com.employee.EmployeeTask1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.EmployeeTask1.entities.Employee;
import com.employee.EmployeeTask1.repository.EmployeeRepository;
import com.employee.EmployeeTask1.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/listEmployee")
	public List<Employee> listAllData() {

		return this.employeeService.getApplications();

	}
	
	@PostMapping("/addemployee")
	public Employee addApplication(@RequestBody Employee employee) {

		return this.employeeService.addEmployee(employee);

	}
	
	@GetMapping("/deletebyid")
	public boolean deleteById(@RequestParam(required = true, value = "id") long id) {

		try {
			employeeRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

}
