package may20;

public class Employee {

	public static void main(String[] args) {
	
		method1();
		methos2();
	}
	static void method1(){
		System.out.println("This  is my first methods ");
		
}
static void methos2()
{
	System.out.println("This is my second program methods");
	int i=1;
	for(i=1;i<=10;i++)
	{
		if(i==4 || i==6)
		{
	continue;
		}
		else if(i>7)
		{
			break;
		}
		System.out.println("The Value if i is "+i);

	}

}
}
