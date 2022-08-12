package Day9ExceptionswithValidations;

public class valApp {
	public static void main(String[] args) {
		
		
		validationsWithExceptions v= new validationsWithExceptions();
		
		try {
			v.phone_mun_validition();
		} catch (exceptionn e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("ho ho ! Plz check Number ur Entered");
		}
		
//		v.validate_gender();
//		v.validate_bank_name();
		//v.validate_Adhar();
		try {
			v.validate_email2();
		} catch (exceptionn e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("ho ho ! Plz Email  ur Entered");

		}
		
		try {
			v.validate_Adhar();
		} catch (exceptionn e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("ho ho ! Plz check AharNum ur Entered");

		}
		
		
	}

}
