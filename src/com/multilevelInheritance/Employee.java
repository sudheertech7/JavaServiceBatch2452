package com.multilevelInheritance;

public class Employee  extends Person{
	
	//Fields
	String employeeCompanyName = "Tata";
	String employeeDesignation = "java Developer";
	int employeeSalary = 600000;
	
	//methods
	void printEmployeeInfo() {
		System.out.println(employeeCompanyName+" "+ employeeDesignation + " "+ employeeSalary);
	}

}
