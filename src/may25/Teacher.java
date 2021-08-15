package may25;

public class Teacher {

public static void main(String[] args) {

Teacher obj = new Teacher();
obj.Teacher_information();
obj.Teacher_information(258);
obj.Teacher_information(256, 257000, "Archana");
String res = obj.result();
System.out.println(res);
}
void Teacher_information()//method overloading 
{
	System.out.println("The Teacher is from methodoverloading class");
}
void Teacher_information(int empid)
{
	System.out.println("The Teacher id is " +empid);
}
void Teacher_information(int empid,String empname)
{
	System.out.println("The Teachar id and name is" + empid + empname);
}
void Teacher_information(int empid,int salary,String empname) {
	System.out.println("The Teachar id and name and salary is " + empid +" "+ salary +" "+ empname );
}
String result()
{
String grade = "A";
int rank =1;
String result =grade + rank;
return result;
}
}
