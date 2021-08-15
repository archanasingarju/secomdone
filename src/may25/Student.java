package may25;

public class Student {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.student_information();
		
		String studentName = "9";
		obj.student_information(studentName);
		
		obj.student_information(1, studentName);
		
		String res = obj.result();
		System.out.println(res);
	}
	
	void student_information() {
		System.out.println("Student is learning in DC");
	}
	
	void student_information(int rollNo) {
		System.out.println("Studnet roll No is " + rollNo);
	}
	
	void student_information(String name) {
		System.out.println("Student name is " + name);
	}
	
	void student_information(int rollNo, String name) {
		System.out.println("Studnet rollNo and Name is " + rollNo + name);
	}
	
	void student_information(String name, int rollNo) {
		System.out.println("Student name and rollNo " + name + rollNo);
	}
	 
	
	
	  String result() 
	  { 
	  String grade = "A"; 
	  int rank = 1; 
	  String result = grade + rank ;
	  
	  return result; }
	 
}
