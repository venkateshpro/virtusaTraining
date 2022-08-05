package Day6;

public class person {
	
	String name;
	int age;
	char gender;
	double phoneNo;
	
	
	
	public person(String name, int age, char gender, double phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNo = phoneNo;
	}
	
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	public void printAge() {
		System.out.println(this.getAge());
	}
	
}
