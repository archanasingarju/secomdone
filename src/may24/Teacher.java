package may24;

public class Teacher {
	Teacher(){    //creating constructor 
	int i = 100;
	int j = 200;
	int z = i+j;
	int a,b=1;
	for(a=3;b<=20;b++)
	{
		int c= a*b;
		System.out.println(a +" * " + b +" ="+  c );
		
	}
	System.out.println("The value of i+j=" +z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher obj3 =new Teacher(203,"archana");//creating object for constructor

		Teacher t =new Teacher();
		Teacher obj = new Teacher(25,25);
		Teacher obj1 =new Teacher(255,"Karshini");
		Teacher obj2= new Teacher(58,78);
}
Teacher (int a,int b)//creating constructor overloaded 
{
	int c = a + b ;
	System.out.println("The sun of a+b=" +c);
}
Teacher (int m, String name)
{
	System.out.println("The student roll no is" +m);
	System.out.println("the student name is"+name);
}
}
