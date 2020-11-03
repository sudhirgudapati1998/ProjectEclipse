package com.pack.service;

import com.pack.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String getInsuranceScheme(Employee emp) {
	   float sa=emp.getSalary();
		if(sa>5000 && sa<20000){
			emp.setDesignation("Associate");
			emp.setInsScheme("Scheme C");
		}
		else if(sa>=20000 && sa<40000){
			emp.setDesignation("Programmer");
			emp.setInsScheme("Scheme B");
		}
		else if(sa>=40000){
			emp.setDesignation("Designation Manager");
			emp.setInsScheme("Scheme A");
		}
		else {
			emp.setDesignation("Designation Clerk");
			emp.setInsScheme("No Scheme");
		}
	return emp.getInsScheme();
			
		 
	}

}
