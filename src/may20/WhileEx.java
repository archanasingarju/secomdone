package may20;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=0;
while (x<=10)
{
	if(x==4 || x==6)
	{
	x++;
		continue;
	}
	else if(x>7)
	 {
		 break;
	 }
	System.out.println("The Value of X is " +x);
	x++;

}
	
		
}

}
