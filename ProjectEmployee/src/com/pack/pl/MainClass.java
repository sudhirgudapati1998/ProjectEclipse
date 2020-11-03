package com.pack.pl;

import java.util.*;

import com.pack.bean.Employee;
import com.pack.service.*;

public class MainClass {


	EmployeeService empService=new EmployeeServiceImpl();
	Employee[] emp =new Employee[3];

	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<3;i++)
		{
		emp[i]=new Employee();
			
		System.out.println("Enter employee " +(i+1)+" id ");
		int value=sc.nextInt();
		 emp[i].setId(value);
		 System.out.println("enter employee "+(i+1) +" name ");
		 String ename=sc.next();
		 emp[i].setName(ename);
		 System.out.println("enter employee "+(i+1)+" salary ");
		 float f=sc.nextFloat();
		 emp[i].setSalary(f);
		 empService.getInsuranceScheme(emp[i]);
		 
		}
	}
	
	void displayDetails()
	{
		for(int i=0;i<3;i++){
			System.out.println("employee details "+i);
		System.out.println("id: "+emp[i].getId());
		System.out.println("name: "+emp[i].getName());
		System.out.println("salary: "+emp[i].getSalary());
		System.out.println("Designation: "+emp[i].getDesignation());
		System.out.println("insurance scheme: "+emp[i].getInsScheme());
		}
	}
	void Search(int id)
	{
		 int flag=0;
		for(int i=0;i<3;i++){
			if(emp[i].getId()==id){
				flag=1;
				System.out.println("employee id is found");
				System.out.println("the details are");
				System.out.println("name: "+emp[i].getName());
				System.out.println("salary: "+emp[i].getSalary());
				System.out.println("Designation: "+emp[i].getDesignation());
				System.out.println("insurance scheme: "+emp[i].getInsScheme());
				
			}
		}
		if(flag==0)
			System.out.println("no such employee id");
	} 
	
	
	public static void main(String[] args) {
	 
	MainClass obj=new MainClass();
	obj.getDetails();
	obj.displayDetails();
	System.out.println("Enter the emp id for which u want to search");
	Scanner scan=new Scanner(System.in);
    int id=scan.nextInt();
    obj.Search(id);
	}

}
