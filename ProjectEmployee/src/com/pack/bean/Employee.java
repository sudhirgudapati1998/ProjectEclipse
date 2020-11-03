package com.pack.bean;

public class Employee {

	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getInsScheme() {
		return insScheme;
	}
	public void setInsScheme(String insScheme) {
		this.insScheme = insScheme;
	}
	int id;
	 String name;
	 String designation;
	 float salary;
	 String insScheme;
	 
	 public String toString()
	 {
		 
		 return id +"  "+name;
	 }
}
