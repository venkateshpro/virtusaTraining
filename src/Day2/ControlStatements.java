package Day2;

import java.util.Scanner;

public class ControlStatements {
	
	public static void controlStatements() {

		int a;
		int b;
		int sum = 0;
		int smaller=0;
		int max;
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		max=sc.nextInt();
		
		if (a<b) {
			
			sum +=a;
			smaller=a;
		}
		else {
			sum +=b;
			smaller=b;
		}
		
		while (a<b){
			b=b-a;
			
		}
		do {
			b=b-a;
		}
		while(a<b);
		
		for(int i=0;i<max;i++) {
			sum +=i;
			
		}
		System.out.println("Smaller is"+smaller);
		System.out.println("maximum value "+ max);
			
	}

}
