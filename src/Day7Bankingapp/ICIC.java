package Day7Bankingapp;

public class ICIC extends Banking {

	@Override
	public void loan() {
		System.out.println("icic providing varoius types of loans "
				 +"1.Carloan"
				+" 2.homeloan"+
				 " 3.personal loan");
	}

	@Override
	public void policy() {
		
	}

	@Override
	public void Fd() {
		 System.out.println("Fixed depsoite  has offer 1% interest per year ");

	}
	
	

}
