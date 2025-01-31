 package com.savitha.oops;

import java.util.Arrays;

class studentTask{
	
	static int PASS_MARK = 40;
	static String COLLEGE_NAME = "Saveetha";
	String studentName;
	int studentId;
	String studentGender;
	int [] studentMarks;
	
	public studentTask(String studentName, int studentId, String studentGender, int[] studentMarks) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentGender = studentGender;
		this.studentMarks = studentMarks;
	}
	
	public void printStudentInfo() {
		System.out.println("College : "+COLLEGE_NAME+ "  Name : " + studentName + "  Student Id : "+ studentId + " Student Gender : " + studentGender + " Marks : " + Arrays.toString(studentMarks));
	}
	
	public void printStudentPercentage() {
		float totalMarks = 0;
		for(int marks : studentMarks) {
			totalMarks = totalMarks + marks;
		}
		
		float marks = totalMarks/(studentMarks.length*100);
		
		float percentage = marks*100;
		
		System.out.println("Total Percentage of "+studentName+" : "+ percentage);
		
	}
	
	public void checkStudentPassOrFail() {
		boolean check = true;
		for(int marks : studentMarks) {
			if(marks<PASS_MARK) {
				check = false;
				break;
			}
		}
		
		if(check) {
			printStudentPercentage();
			System.out.println(studentName +"  : PASS");
		}
		else {
			printStudentPercentage();
			System.out.println(studentName + " : FAIL");
		}
		
	}
}

public class MainStudentTask {
	
	public static void main(String[] args) {
		studentTask sudheer = new studentTask("sudheer", 1234, "Male", new int [] {60,55,50,50,100});
		sudheer.printStudentInfo();
		System.out.println("-----------------------------------------------------");
		sudheer.printStudentPercentage();
		System.out.println("-----------------------------------------------------");
		sudheer.checkStudentPassOrFail();
		
		
	}

}
