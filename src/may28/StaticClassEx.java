package may28;

public class StaticClassEx {
	static int a=20;
	public static void main(String[] args) {
		StaticClassEx.dept.storedept();
		StaticClassEx.dept obj = new StaticClassEx.dept();
		obj.displaydept();
		System.out.println(a);
	}
static class dept {
	static void storedept() 
{
	System.out.println("iam from static class and method");
}
	void displaydept()
	{
		System.out.println("iam from static class and non static method");	
	}
	}
}
