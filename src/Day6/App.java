package Day6;

public class App {
	public static void main(String[] args) {
		employee e1= new employee();
		
		e1.name="venkat";
		e1.age=21;
		e1.gender='M';
		e1.phoneNo=122345555;
		
		person p1= new employee();
		p1.age=30;
		p1.name="virat";
		p1.phoneNo=9999999;
		p1.gender='M';
		
		person p2= new person();
		p2.age=32;
		p2.name="sachin";
		p2.gender='M';
		p2.phoneNo=3333333;
		
		p1.getAge();
		e1.getE_id();
		
		//employee e2= new person();
		
		p2.printAge();
		e1.printAge();
		
		
	}

}
