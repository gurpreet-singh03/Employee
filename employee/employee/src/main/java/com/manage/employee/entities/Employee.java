package com.manage.employee.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="employee_details")
public class Employee {

	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emp_id;
	private String emp_name;
	private String work_email;
	private String personal_email;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	
	private Designation designation;
	private int Salary;
	
	
	
	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	

	public Employee() {
		 
	}
	
	
	
	public int getEmp_id() {
		return emp_id;
	}
	
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getEmp_name() {
		return emp_name;
	}
	
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public String getWork_email() {
		return work_email;
	}
	
	public void setWork_email(String work_email) {
		this.work_email = work_email;
	}
	
	public String getPersonal_email() {
		return personal_email;
	}
	
	public void setPersonal_email(String personal_email) {
		this.personal_email = personal_email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Designation getDesignation() {
		return designation;
	}
	
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	

}
