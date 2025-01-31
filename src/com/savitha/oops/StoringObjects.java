package com.savitha.oops;
class Students{
	int studentId;
	String studentName;
	String studentGender;
	public Students(int studentId, String studentName, String studentGender) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGender = studentGender;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	
	
}

public class StoringObjects {
	
	public static void main(String[] args) {
		
		
		Students alex = new Students(123, "alex", "male");
		alex.setStudentName("sudheer");
		
		
		System.out.println(alex.studentName);
		
		
		
		
	}

}
