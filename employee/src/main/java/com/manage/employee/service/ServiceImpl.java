package com.manage.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.employee.entities.Designation;
import com.manage.employee.entities.Employee;
import com.manage.employee.response.Response;

@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	private Response response;
	
	
	
	
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
	   List <Employee> list=(List<Employee>) response.findAll();
	   return list;
	}
	
	
	@Override
	public long countEmployee() {
		// TODO Auto-generated method stub
	    long ans=response.count();
		return ans;
	}
	
	
	@Override
	public Employee addEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		response.save(newEmployee);
		return newEmployee;
		
	}
	
	
	
	@Override
	public Employee updateEmployee(int id, Employee newEmployee) {
		// TODO Auto-generated method stub
		List <Employee> list=(List<Employee>) response.findAll();
		int flag=0;
		for(Employee lst:list) {
			if(lst.getEmp_id()==id){
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("no such employee");
			return null;
		}
		
		response.save(newEmployee);
		return newEmployee;
	}
	
	
	
	
	
	
	@Override
	public Employee getSingleEmployee(int id) {
		// TODO Auto-generated method stub
		
		List<Employee> list =(List<Employee>)response.findAll();
		for(Employee lst:list) {
			if(lst.getEmp_id()==id) return lst;
		}
		
		System.out.println("function called");
		
//		Employee employee=response.findById(id);
		return null;
	}
	
	
	
	
	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		response.deleteById(id);
		
	}
	
	
	
	
	@Override
	public List<Employee> getByDesignation(Designation designation) {
		// TODO Auto-generated method stub\
     	List<Employee> list =(List<Employee>)response.findAll();
     	
     	List<Employee> designation_list=new ArrayList<Employee>();
     	
     	for(Employee lst:list) {
     		if(lst.getDesignation()==designation) designation_list.add(lst);
     	}
		
		return designation_list;
	}
	
	
	
	
	@Override
	public List<Employee> employeeSalary(int salary) {
		// TODO Auto-generated method stub
		List<Employee> list =(List<Employee>)response.findAll();
		List<Employee> salary_list= new ArrayList<Employee>();
		
		for(Employee lst:list) {
			if(lst.getSalary()<=salary) salary_list.add(lst);
		}
		
		return salary_list;
	}


//	@Override
//	public String hikeSalary(Designation designation,int bonus){
//		// TODO Auto-generated method stub
//		
//		
//		
//		return "bonus for  "+designation+" is "+bonus+"%";
//	}


	





	
	
	
	

}
