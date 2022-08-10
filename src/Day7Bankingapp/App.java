package Day7Bankingapp;

import java.util.Scanner;

public class App {


	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		BankingService bs = null;
		System.out.println("***  WElcome to Banking Service ***");
	
		
		
		System.out.println("Please select the bank :\nsbi\nicici\nhdfc");
		
		String  bank=sc.next();
		
		if(bank.equals("sbi")) {
			bs= new SBI();
		}
		else if(bank.equals("icic")) {
			bs= new ICIC();
			
		}
		
		else if(bank.equals("hdfc")) {
			bs = new HDFC();
			
		}
		
		
		System.out.println("Please select the service :\nloan\nfd\npolicy");
		String service= sc.next();
		
		switch(service) {
			case "loan":
				bs.loan();
				break;
			case "fd":
				bs.Fd();
				break;
			case "policy":
				bs.policy();
				break;
			
		}
		
	}

}
