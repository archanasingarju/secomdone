package may19;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;
for(i=1;i<=10;i++)
{
	if(i==4 || i==6)
	{
continue;
	}
	else if(i>7)
	{
		break;
	}
	System.out.println("The Value of i is " +i);

}
}

}
