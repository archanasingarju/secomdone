package may24;
public class Student {
	
	Student() {
		System.out.println("i am from Student constructor");
		int a=10;
		int b =20;
		int c = a+b;
		
		System.out.println("sum of A and B is " + c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		Student obj2 = new Student(10, 15);
		Student obj3 = new Student(10, 50);
		Student obj4 = new Student(10, "DigitalCutlet");
		Student madhavi = new Student(700, "Shiva");
		Student arcg = new Student(845, "Shiva");

	}
Student(int X, int Y){
		int Z = X + Y;
		System.out.println("addition on x and y is " + Z);
	}
Student(int rollNo, String studentName)
	{
		System.out.println("Roll Num of the Student is " + rollNo);
		System.out.println("Name of the student is " + studentName);
	}
Student(String a, int b) {
}
}
