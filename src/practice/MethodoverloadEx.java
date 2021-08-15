package practice;

public class MethodoverloadEx {

public static void main(String[] args) {
		MethodoverloadEx M=new MethodoverloadEx();
		M.add(25, 50, "Archana", "Hari Prasad", 25000.288, 0);
		M.dispaly(100);
		String name = M.sum();
		System.out.println(name);
}
void add()
{
	System.out.println("I am from MethodoverloadEX");
}
void add(int a,int b,String name,String fname,double c,int d) 
{
	d = a + b ;
	System.out.println("My name is: "+name);
	System.out.println("My father Name is: " +fname);
	System.out.println("My father Salay is: " +c);
	System.out.println("The sum of A and B is: " +d);
}
String sum() {
	return "Suvarna kumai,kuamri";
}
int dispaly(int T)
{
	System.out.println("I am from another method " +T);
return T;
}
}