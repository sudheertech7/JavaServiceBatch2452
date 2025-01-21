package com.savitha.oops;

class Student1{
	static String STUDENT_COLLEGE = "Saveetha";
	String stdName;
	String stdGender;
	
	public Student1(String stdName,String stdGender) {
		this.stdName = stdName;
		this.stdGender = stdGender;
	}
	
	public void printStudentInfo() {
		System.out.println(STUDENT_COLLEGE +" : " + stdName + "  "+ stdGender);
	}
}

public class MainStudent1 {
	
	public static void main(String[] args) {
		Student1 s1 = new Student1("alex", "male");
		s1.printStudentInfo();
		Student1 s2 = new Student1("roy", "male");
		s2.printStudentInfo();
		Student1 s3 = new Student1("ravi", "male");
		s3.printStudentInfo();
		Student1 s4 = new Student1("ram", "male");
		s4.printStudentInfo();
		Student1 s5 = new Student1("raju", "male");
		s5.printStudentInfo();
		
	}

}
