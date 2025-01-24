package com.multilevelInheritance;

public class Manager extends Employee{
	String managerName = "roy";
	String managerGender = "male";

	void printManagerInfo() {
		System.out.println(managerName+ " " + managerGender);
	}

	public static void main(String[] args) {
				
		Manager manager = new Manager();
		System.out.println(manager.managerName);
		System.out.println(manager.managerGender);
		manager.printManagerInfo();
		System.out.println("----------------------");
		
		System.out.println(manager.employeeCompanyName);
		System.out.println(manager.employeeDesignation);
		System.out.println(manager.employeeSalary);
		manager.printEmployeeInfo();
		
		System.out.println("----------------------");
		
		System.out.println(manager.personName);
		System.out.println(manager.personGender);
		System.out.println(manager.age);
		manager.printPersonInfo();
	}
}
