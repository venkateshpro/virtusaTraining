package Day7Bankingapp;

public class HDFC extends Banking {

	@Override
	public void loan() {
		System.out.println("HDFC providing varoius types of loans "
				 +"1.Carloan"
				+" 2.homeloan"+
				 " 3.personal loan");
	}

	@Override
	public void policy() {
		 System.out.println("hdfc has the policy of ");
	}

	@Override
	public void Fd() {
		 System.out.println("Fixed depsoite  has offer 3% interest per year ");

	}
	
	

}
