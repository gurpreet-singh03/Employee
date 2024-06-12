package com.manage.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manage.employee.entities.Designation;
import com.manage.employee.entities.Employee;

@Service
public interface ServiceInterface {
	
	public List<Employee> getEmployee();
	
	public Employee addEmployee(Employee newEmployee);
	
	public long countEmployee();
	
	public Employee updateEmployee(int id,Employee newEmployee);
	
	public Employee getSingleEmployee(int id);
	
	public void deleteEmployee(int id);
	
	public List<Employee> getByDesignation(Designation designation);
	
	public List<Employee> employeeSalary(int salary);
	

}
