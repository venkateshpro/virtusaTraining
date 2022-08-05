package Day6;

public class functionalities implements calculater,caluclater2 {
	

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);

	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a%b);

		
	}

	

}
