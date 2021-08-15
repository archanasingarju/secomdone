package may28;

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx obj = new ConstructorEx();
		ConstructorEx obj1 = new ConstructorEx(25,80,"archana");
	}
ConstructorEx()
{
System.out.println("This my first constructor");	
}
ConstructorEx(int a,int b)
{
	System.out.println("This my second constructor"+ "and" + a + b);
}

ConstructorEx(int a,int b,String name)
{
	System.out.println("This my second constructor"+ "and" + a + b + name);
}
}

