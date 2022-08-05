package Day4;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Accessspetifiers as= new Accessspetifiers();
		
		
			int a;
			int b;
			Scanner sc= new Scanner(System.in);
			
			a=sc.nextInt();
			b=sc.nextInt();
			
		Activity ac= new Activity();
		ac.Add(a, b);
		//ac.mul(a, b);
		//ac.mul(a, b);
		ac.Add(a, b);
		
	}
		
	

}
