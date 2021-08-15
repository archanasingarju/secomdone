package may27;

public class BlackandWhite {
	int a=100;//a and b are called instance variables 
	int b=200;
	String name ="Black and white";
	String TV_Name="The Panasinic TV";
	public static void main(String[] args)
{
		BlackandWhite obj = new BlackandWhite();
		BlackandWhite obj1 =new BlackandWhite(25,50);
		obj.CRT_BAW();
		obj.CRT_Remote();
		obj.CRT_Volume(0, 10);
		obj.Quality();
}
BlackandWhite()
{
System.out.println("My name is archana");	
}
BlackandWhite(int X,int Y)
{
System.out.println("THE VALUES OF X AND Y IS " +X +Y);	
}

void Quality() {
	System.out.println("Picture is only Colors only");
		
	//System.out.println("Picture is only Colors only");
	}
	
void CRT_BAW()
{
System.out.println("I am from Black and White CRT");
}
void CRT_Remote()
{
System.out.println("Iam from Reomte");
}
void CRT_Volume(int maxv,int minv)
{
	System.out.println("Iam from Volume"+"max value="+maxv +"min value="+minv);
}

}