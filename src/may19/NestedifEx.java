package may19;

public class NestedifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i =30;
if(i==35) 
{
if(i>=90 || i<90)

{
	System.out.println("The Student got A+");
}
else if(i>=80 || i<80)
	System.out.println("The Student got A");
else if (i>=70 || i<80)
{
	System.out.println("The Student got B+");	
}
else if(i>=60 || i<70)
{
	System.out.println("The Student got B");
}
else if(i>=50 || i<60)
{

	System.out.println("The Student got C");
}
}
else
{
	System.out.println("The Student Failed");	
}
	}

}
