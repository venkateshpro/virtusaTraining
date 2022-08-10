package Day7Bankingapp;

public class SBI extends Banking {

	@Override
	public void loan() {
		System.out.println("SbI providing varoius types of loans "
				 +"1.Carloan"
				+" 2.homeloan"+
				 " 3.personal loan"+
				"SBI spetail Intrest loan");
	}

	@Override
	public void policy() {
		System.out.println("Sbi policies are............");
		
	}

	@Override
	public void Fd() {
		 System.out.println("Fixed depsoite  has offer 2% interest per year ");
	}
	
	
	
	

}
