package may20;

public class DowhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b=1;
do
	{
	if(b==4 || b==6)
	{
		b++;
		continue;
	}
	
	 else if(b>7)
	 {
		 break;
	 }
		
	System.out.println("The Value of b  is " + b );
	b++;
}
while(b<=10);
	

	}

}
