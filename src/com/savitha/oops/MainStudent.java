package com.savitha.oops;
class Student{
	
	int studentId;
	String studentName;
	String studentGender;
	
	public Student(int sId, String sName, String sGender){
		studentId = sId;
		studentName = sName;
		studentGender = sGender;
	}
	
	public void printStudentInfo(){
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(studentGender);	
	}
}

public class MainStudent {
	
	public static void main(String[] args) {
		Student alex = new Student(123, "alex", "male");
		Student ravi = new Student(456, "ravi", "male");
		
		alex.printStudentInfo();
		System.out.println("-------------------------");
		ravi.printStudentInfo();
		
	}

}
