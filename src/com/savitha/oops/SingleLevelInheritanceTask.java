package com.savitha.oops;

class Parent{
	String parentName = "Alex";
	String parentGender = "Male";
	String parentRelation = "Father";
	
	void printParentInfo(){
		System.out.println("Parent Name : "+ parentName);
		System.out.println("Parent Gender : "+ parentGender);
		System.out.println("Parent RelationShip : "+ parentRelation);
	}
	
}

class Child extends Parent{
	String childName="roy";
	String childGender = "male";
	int childAge = 8;
	
	void printChildInfo(){
		System.out.println("Child Name : "+ childName);
		System.out.println("Child Gender : "+ childGender);
		System.out.println("Child Age : "+ childAge);
	}
}

public class SingleLevelInheritanceTask {
	
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.childName);
		System.out.println(child.childGender);
		System.out.println(child.childAge);
		child.printChildInfo();
		System.out.println("-----------------");
		System.out.println(child.parentName);
		System.out.println(child.parentGender);
		System.out.println(child.parentRelation);
		child.printParentInfo();
	}

}
