package may25;
public class ConstEx {

	public static void main(String[] args) {

	ConstEx obj =new ConstEx();
	ConstEx obj1 =new ConstEx(25,"Archana");
	ConstEx obj2 =new ConstEx("S","Archana");
	ConstEx obj3 =new ConstEx(25,30);
}
ConstEx(){
System.out.println("This my first Constructor ");
	
}
ConstEx(int a,String name)
{
	System.out.println("My roll no is "+a +"and name is" + name);
}
ConstEx(String fname,String lname){
	System.out.println("My Name is "+ fname+lname );
}
ConstEx(int a,int b){
System.out.println("The Value of A and B is" +a+","+b);
}

}
