package june2;

public class Office extends Emp {

public static void main(String[] args) {
Office obj = new Office();
//Emp obj2= new Emp();
Emp.mine1();
obj.abc();
obj.admin();
obj.dispaly();
obj.add();

System.out.println("The number n value is"+n);
System.out.println("The number m value is"+obj.m);
System.out.println("The number n value is"+obj.mname);
System.out.println("The number n value is"+fname);


}


Office()
{
//super("sairam",25444.111);
super("selenium",2500.258,100);
}

void admin()
{

System.out.println("Iam from admin department");
}

void dispaly() {
	
System.out.println("Iam from abstract method");
}

void add() {
	
System.out.println("iam from add method ");	
}
}
