package may28;

public class MethodO {
public static void main(String[] args) {
MethodO obj =new MethodO();
obj.addition(5,60);
obj.addition(1,4,0);
}
int addition(int a,int b)
{
	int c=a+b;
	System.out.println("a+b="+c);
	return c;
}
int addition(int i,int j,int r)
{
for(i=1;i<=10;i++)
{
r = i * j;
System.out.println(j+"*"+i+"="+r);
}
return r;
}
}


