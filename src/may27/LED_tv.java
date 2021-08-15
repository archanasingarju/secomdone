package may27;

public class LED_tv extends CRT_color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LED_tv led =new LED_tv();
led.LED_HDMI();
led.LED_slim();
led.CRT_Color();
led.CRT_remote();
led.CRT_Remote();
led.CRT_Volume();
}
void LED_slim()
{
System.out.println("Iam from LED_slim");	
}
void LED_HDMI()
{
System.out.println("i Have HDMI features");	
}
}
