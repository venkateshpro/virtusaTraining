package Day8;

import java.util.Scanner;
import java.util.regex.Pattern;



public class validationswithString {
	Scanner sc = new Scanner(System.in);
	
	public void phone_mun_validition() {

		System.out.println("plz enter  moblie num");
		
		String num=sc.next();	
		
		if (num.length()==10) {
			System.out.println("***valid mobile number***");
			
		}
		else {
			System.out.println("Invalid Number");
		}
		
	}
	
	public void validate_gender() {

		System.out.println("enter gender");
		
		char gen= sc.next().charAt(0);
			
		if( gen=='m' || gen=='f'|| gen=='o') {
			System.out.println("given gender is valid  ");
		}
		else {
			System.out.println("invalid gender diclaration plz enter valid gender");
		}
		
	}
	
	
	public void validate_bank_name() {
		System.out.println("plz Enter the bank name u want to choose");
		
		String bank= sc.next();
		
		if (bank.equalsIgnoreCase("sbi")) {
			
			System.out.println("the given bank name is valid ");
			
		}
		else {
			System.out.println("given bank name is inavalid ");
		}
		
		
	}
	
	
	
	public void validate_Adhar() {
		
		System.out.println("plz enter Adhar Num");
		String addar= sc.nextLine();
		String regex="^[2-9]{1}[0-9]{3}[\\s][0-9]{4}[\\s][0-9]{4}";
		
		Boolean b=Pattern.matches(regex, addar);
		if (b) {
			
			System.out.println("Valid Adhar number");	
			
		}
		else {
			System.out.println("invalid Adhar number plx check!!!!");
		}
	}
	
	
	
	
	
	public void validate_email2() {
		System.out.println("Plz enter email");
		String email=sc.next();
		String regex= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Boolean b=Pattern.matches(regex, email);
		if(b) {
			System.out.println("Its Valid email");
		}
		else {
			System.out.println("Invalid check onece");
		}

	}
	
	public void validate_pancarr() {
		
	}
	public static void main(String[] args) {
		
		
		validationswithString v= new validationswithString();
		
//		v.phone_mun_validition();
//		v.validate_gender();
//		v.validate_bank_name();
		v.validate_Adhar();
		//v.validate_email2();
		
		
	}

}
