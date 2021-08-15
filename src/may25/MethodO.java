package may25;
public class MethodO {

	public static void main(String[] args) {
	//MethodO obj = new MethodO();
		MethodO obj = new MethodO();
		obj.dispaly();
		obj.display(50,25);
		obj.display(25000.785, 258, "Archana");
		obj.display(25, 85, "Archana", "Karshini");
		
}
void dispaly()
{
System.out.println("display");	
}
void display(int a,int b)
{
int d= b-a;
System.out.println("The sub of b-a"+d);
}

void display(double salary,int no,String name) {
System.out.println("My salary is="+salary);
System.out.println("My emp no is="+no);
System.out.println("My name is="+name);
}
void display(int a, int b, String name,String name1){
	int c=a+b;
	System.out.println("The sum of a+b="+c);
	System.out.println("My name is"+name);
	System.out.println("My Daughter name is"+name1);
}
}
