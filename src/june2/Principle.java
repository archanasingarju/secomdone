package june2;

public class Principle implements Teacher,Student,DrialTeacher{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principle obj = new Principle();
		obj.books();
		obj.teaching();
		obj.name();
		obj.rolln();
		obj.playg();
		obj.games();
		obj.score();
	}

	@Override
	public void books() {
		// TODO Auto-generated method stub
		System.out.println("iam from books dept");
	}

	@Override
	public void teaching() {
		// TODO Auto-generated method stub
		System.out.println("Iam from teaching dept");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("My name is Aneetha");
	}

	@Override
	public void rolln() {
		// TODO Auto-generated method stub
		System.out.println("My Rollno is 2422");	
	}

	@Override
	public void playg() {
		// TODO Auto-generated method stub
		System.out.println("Iam playground");
	}

	@Override
	public void games() {
		// TODO Auto-generated method stub
		System.out.println("Iam playing games");
	}

	@Override
	public void score() {
		// TODO Auto-generated method stub
		System.out.println("iam from the score");
	}

}
