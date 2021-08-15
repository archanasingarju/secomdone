package practice;

public class Parent {
	int a =100;
	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		Parent obj =new Parent();
		Parent obj1 = new Parent(70,80);
		obj.computer();
		obj.house();
		obj.musicsys();
		
}
Parent()
	{
		System.out.println("Iam from Constructor");
	}
Parent(int x,int y){
	System.out.println("The values of x and y"+x + y);	
}
void house()
{
System.out.println("Parents Have a Beautiful GPlusHouse");
}
void musicsys()
{
	System.out.println("Father Have a one good Music System");
}
void computer()
{
System.out.println("Moter have one good Computer");
}
}
