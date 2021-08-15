package june1;
public  class OfficeB {
public String name ="Archana";
public static void main(String[] args) {
OfficeB obj =new OfficeB();
obj.xyz();
OfficeA obj1 =new OfficeA();
obj1.abc();
System.out.println(obj1.a);
}
void xyz() {
	System.out.println("iam form xyz compamy ");
}
public void softdept()
{
System.out.println("Software department");
}
public void testing()
{
	System.out.println("Testing departement");
}
}

