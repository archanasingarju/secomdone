package may21;

class Monkey//super class
{
void eat()
{
System.out.println("eating");	
}
}
class Cat extends Monkey//parent class single inheritance example
{
void barking()
{
	System.out.println("barking");
}
}
class NewEx {

	public static void main(String[] args) {
		//NewEx a = new NewEx();
		//Monkey aa =new Monkey();
		Cat d = new Cat();
		d.eat();
		d.barking();
		
	}
	}