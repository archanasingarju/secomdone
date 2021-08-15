package may27;


public class Classoverride extends BlackandWhite {
	String TV_Name= "The PanasonicPlus TV";	
	String name ="color";
	
	int a=500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classoverride obj = new Classoverride();
		obj.CRT_BAW();
		obj.CRT_Volume(1, 25);
		//obj.CRT_Remote();
		//obj.Quality();
		
	}

Classoverride()
{
	super(200,100);
}
void CRT_BAW()
	{
	System.out.println("I am from Black and White CRT");
	System.out.println("Iam know color also");
	System.out.println("My name is" + super.name);
	CRT_Remote();
	//System.out.println(super.);
	super.Quality();
	
	}

	
	void Quality() {
		System.out.println("Picture have 3D Quality");
		System.out.println("Picture have 4G Quality also");
		System.out.println("Picture Quality rete is"+super.a);
		//super.
		System.out.println("The name of the is" + super.TV_Name);
	}
	
	void CRT_Remote()
	{
	System.out.println("Iam from Reomte");
	}
	void CRT_Volume(int maxv,int minv)
	{
		System.out.println("Iam from Volume"+"max value="+maxv +"min value="+minv);
		System.out.println("Iam new additional feature");
	}
	void RemoteButton()
	{
	System.out.println("Iam Power On And Off Button");
	}
}
