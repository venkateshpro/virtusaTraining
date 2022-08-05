package Day3;

public class person {
	
	
	String p_name;
	String p_addar;
	char p_gender;
	int age;
	
	person(){
		p_name=null;
		p_addar=null;
		p_gender=0;
		age=0;
		
	}

	 person(String p_name, String p_addar, char p_gender, int age) {
		this.p_name = p_name;
		this.p_addar = p_addar;
		this.p_gender = p_gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [p_name=" + p_name + ", p_addar=" + p_addar + ", p_gender=" + p_gender + ", age=" + age + "]";
	}
	 
	 
	

}


