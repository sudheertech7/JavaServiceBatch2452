package bacisOfOops;
class Student{
	   private final static String STUDENT_COLLEGE = "Saveetha";
	   private int studentId;
	   private String studentName;
	   private String studentGender;
	public Student(int studentId, String studentName, String studentGender) {
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
	public static String getStudentCollege() {
		return STUDENT_COLLEGE;
	}	
}
public class MainStudent {
	public static void main(String[] args) {
		Student alex = new Student(1234, "Alex", "male");
		System.out.println(alex.getStudentName());
		alex.setStudentName("Ram");
		System.out.println(alex.getStudentName());
	}
}
