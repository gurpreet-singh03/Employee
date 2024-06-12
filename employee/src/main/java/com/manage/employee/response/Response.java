package com.manage.employee.response;

import org.springframework.data.repository.CrudRepository;

import com.manage.employee.entities.Employee;

public interface Response extends CrudRepository<Employee,Integer > {
	public Employee findById(int id);
}
