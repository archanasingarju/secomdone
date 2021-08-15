package may27;
public class ClassTeacher {

public static void main(String[] args) 
{
	Soteacher obj2 = new Soteacher();
	String name =obj2.classT();
	String name1=obj2.science();
	String name2=obj2.social(85, 75, 92, 75, 95);
	System.out.println("My Subject names and Score ");
	System.out.println(name +","+name1+"," +name2);
}
}
class Cteacher
{ 
String classT(){
return  "Math,English,Drawing";
}
}
class Scteacher extends Cteacher{
String science() {
return "Science,ES";
}
}
class Soteacher extends Scteacher {

String social( int a,int b,int c,int d,int e) {
	int total =a+b+c+d+e;
return "Social,GK"+" "+"and"+" "+"Score "+ total;	
}		
}



