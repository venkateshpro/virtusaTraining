package Day9;

import java.util.*;


public class exception {
	
	public void Arthamatic() {
		
		Scanner sc =new Scanner(System.in);
		int a=0;
		int b=0;
		
		try {
			 a= sc.nextInt();
			 b= sc.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("plz check the numbers, give valid numbers");
		
		}
//		throw new ArithmeticException("plz check numbers");
		
		catch(InputMismatchException ie) {
			
			System.out.println("It only allow the numbers");
			
		}
		try {
			System.out.println(a+b);
			
		}
		catch(Exception e) {
			
		}
		
		
		
	}
	public static void main(String[] args) {
		
		exception e= new exception();
		e.Arthamatic();
	}

}
