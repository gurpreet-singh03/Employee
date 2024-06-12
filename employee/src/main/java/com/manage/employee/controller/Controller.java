package com.manage.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manage.employee.entities.Designation;
import com.manage.employee.entities.Employee;
import com.manage.employee.service.ServiceImpl;

@RestController
public class Controller {
	@Autowired
	private ServiceImpl serviceVar;
	
	
	
// 	just for health check
	
	@GetMapping("/healthCheck")
	public String checkHealth() {
		return "Service is Up";
	}
	
//   get all the employees
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		System.out.println("table");
		return serviceVar.getEmployee();
	}
	
	@GetMapping("/count/employee")
	public long getCount() {
		return serviceVar.countEmployee();
	}
	
	
	
	// single specific employee
	@GetMapping("/employee/{id}")
	public Employee getSingleEmployee(@PathVariable int id) {
		return serviceVar.getSingleEmployee(id);
	}
	
	
	
	
	//list of employee with specific designation
	@GetMapping("/fetchByDesignation/{designation}")
	public List<Employee> getByDesignation(@PathVariable Designation designation){
		return serviceVar.getByDesignation(designation);
	}
	
	
	
	
	// list of employee according salary
	@GetMapping("salaryCount/{salary}")
	public List<Employee> employeeSalary(@PathVariable int salary){
		return serviceVar.employeeSalary(salary);
	}
	
	
	
	
//	 add new employee
	@PostMapping("/add/employee")
	public Employee addEmployee(@RequestBody Employee newEmployee) {
		return serviceVar.addEmployee(newEmployee);
		
	}
	
	
	
	
//	 delete the employee
	@DeleteMapping("/delete/employee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		serviceVar.deleteEmployee(id);
	}
	
	
	
	
//	 to update the employee
	@PutMapping("/update/employee/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee newEmployee) {
		return serviceVar.updateEmployee(id,newEmployee);
	}
	
//	@PutMapping("/hikeSalary/{designation}/{bonus}")
//	public String hikeSalary(@PathVariable Designation designation,@PathVariable int bonus) {
//		
//		return serviceVar.hikeSalary(designation,bonus);
//	}
	
//	@PutMapping("/hikeSalary")
//	public String hikeSalary() {
//		return serviceVar.hikeSalary();
//	}
	
	

}
