package Day6;

public class employee extends person{

	int e_id;
	

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employee(String name, int age, char gender, double phoneNo) {
		super(name, age, gender, phoneNo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printAge() {
		int newage= super.getAge()+1;
		System.out.println(newage);
	}
	
	
	

}
