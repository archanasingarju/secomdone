package may28;

public class StaticVariableEX2 {
	String officeName = "TCS";
	static String dept = "software";
	public static void main(String[] args) {
	System.out.println(dept);
	//System.out.println(officeName); // it dont accept in this method because its a non-static instance variable
}
void printOffice() {
System.out.println(officeName);
System.out.println(dept);
}
}