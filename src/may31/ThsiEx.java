package may31;

public class ThsiEx {
	
	int a=200;
	int b=300;
	int salary=100000000;
	public static void main(String[] args) {
		ThsiEx  obj = new ThsiEx();
		obj.display();
		obj.add(20000,"archana");
		obj.dispaly(100000, 100);
		System.out.println("my name is archana");
}
void dispaly(int salary,int no) {
	System.out.println("THE SALARY AND NOS ARE " +this.salary + "  "+ no );
}
void display()
{
System.out.println("Iam not from the this method");
//this.add(500000, "Sai ram");
}
void add(int salary,String name)
{
System.out.println("Iam from this method" +salary + name);	
}
}
