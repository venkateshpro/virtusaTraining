package Day9ExceptionswithValidations;
import java.util.Scanner;


import java.util.regex.Pattern;
public class validationsWithExceptions {
		
	

		Scanner sc = new Scanner(System.in);
		
		public void phone_mun_validition() throws exceptionn {

			System.out.println("plz enter  moblie num");
			
			String num=sc.nextLine();	
			
			if (num.length()==10) {
				
				System.out.println("***valid mobile number***");
				
			}
			else {
				//System.out.println("Invalid Number");
				throw new exceptionn("Invalid Phone number");
				
			}
			
		}

		public void validate_email2() throws exceptionn {
			System.out.println("Plz enter email");
			String email=sc.nextLine();
			String regex= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			Boolean b=Pattern.matches(regex, email);
			if(b) {
				System.out.println("Its Valid email");
			}
			else {
				//System.out.println("Invalid check onece");
				throw new exceptionn("Inavlid email entire");
			}

		}
		
		public void validate_Adhar() throws exceptionn {
			
			System.out.println("plz enter Adhar Num");
			String addar= sc.nextLine();
			String regex="^[2-9]{1}[0-9]{3}[\\s][0-9]{4}[\\s][0-9]{4}";
			
			Boolean b=Pattern.matches(regex, addar);
			if (b) {
				
				System.out.println("Valid Adhar number");	
				
			}
			else {
				//System.out.println("invalid Adhar number plx check!!!!");
				throw new exceptionn("Inavlid Adhar Number");
				
			}
		}
		
	
}



