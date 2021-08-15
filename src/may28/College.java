package may28;

public class College {
	
	static String collegename = "Nagaraju PG and Degre";//static key word is used to reduce the size of memory 

	void abc(String Name,int Rolno,String collegename)
	{
		System.out.println("Student name is: "+Name + "Rol No is:"+ Rolno +"Collegename is:"+collegename);

	}
	void abc(String Name,int Rolno)
	{
		System.out.println("Student name is: "+Name + "Rol No is:"+ Rolno +"Collegename is:"+collegename);
	}
	public static void main(String[] args) {
		College obj =new College();
		String collegename = "Nagaraju PG";

		obj.abc("Teja", 1, collegename);
		obj.abc("Archana", 2, collegename);
		obj.abc("Karshini", 3, collegename);
		obj.abc("Ravi", 10);obj.abc("Ramya", 20);
}
}
