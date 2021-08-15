package practice;

public class Gchild extends Parent{ //multilevel inheritence

int b = 100;
int a = 10;	
	public static void main(String[] args) {
		   
Gchild obj = new Gchild();
obj.computer();
//obj.house();
obj.musicsys();
obj.gchild();
}
Gchild()
{
	//System.out.println("im from second");
	super(25,25);
}
void gchild ()
{
System.out.println("I have new Toy Car");
System.out.println("I have New Toy Cycle");
System.out.println(super.a);
super.house();
}
void house()
{
	System.out.println("Parents Have a Beautiful GPlusHouse");
	System.out.println("I have build a new pent house in top");
}
}


