package may21;

public class Methods {

	public static void main(String[] args)
{
		System.out.println("Here im using methods");
		Methods obj =new Methods();//creating object

		obj.Method_first();

		obj.Method_second();

		obj.Method_third();
}
void Method_first()
{
	System.out.println("this is my first method");	//void did not return any value
}
void Method_second()
{
	System.out.println("this is my second method");
}
void Method_third()
{
	System.out.println("this is my thrd method");
	 Method_four();
}
void Method_four()
{
	System.out.println("this is my fourth method");
}

}
