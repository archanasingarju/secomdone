package may26;

public class TV_4K extends BlackandWhite {

	public static void main(String[] args) {
		TV_4K tv = new TV_4K(); 
		tv.Tv_LED();
		tv.TV_Remote();
		tv.TV_Slim();
		tv.CRT_BAW();
		tv.CRT_Remote();
		tv.CRT_Volume();
		System.out.println("My TV_4K prepre done and ready to use");
	}
void Tv_LED() {
System.out.println("I have LCD feature");
}
void TV_Remote()
{
System.out.println("I have new remote");	
}
void TV_Slim()
{
System.out.println("I have new Slim model");	
}
}
