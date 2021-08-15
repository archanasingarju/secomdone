package may31;

public class FinalEx {
	final String ins_name ="Digital Cutlet";
	public static void main(String[] args) {
		FinalEx obj = new FinalEx();
		obj.display();
		obj.add();
		// TODO Auto-generated method stub
		//System.out.println(ins_name);
	}
void display()
{
	//ins_name ="DC"; //we cont change the value of the values final instance variable
	System.out.println(ins_name);
}
  final void add() {
	
System.out.println("I have finalmethod");
}
}
