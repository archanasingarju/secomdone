package may21;

public class CallMethodUsingParam {

	public static void main(String[] args)
{
		CallMethodUsingParam main = new CallMethodUsingParam();
		
		int add1 = main.add(20, 85);
		System.out.println(add1);
		int  sub1 = main.sub(200, 100);
		System.out.println(sub1);
		int tot1 = main.tot(10, sub1);//return  value  from above method
		System.out.println(tot1);
		String name =main.name_course();//creating a obj for string
		System.out.println(name);
		
}
int add(int a,int b)	//passing parameters
{
	
	int c =a + b;
	return c;//returning a value and after statement dont write system.out.println
}
int sub(int X,int Y)	{
	
	int Z =X - Y;
	return Z;
}
int tot(int i,int j)	{
	
	int k =i+j;
	return k;
}
String name_course()
{
return "Selenium";
}
}