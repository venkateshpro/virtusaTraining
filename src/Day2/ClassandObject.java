package Day2;

public class ClassandObject {
	
	
		  int emp_id;
		  int emp_salary;
		  String name;
		  int age;

		  ClassandObject(int id, String name, int age, int salary) {
		    
		    emp_id = id;
		    emp_salary = salary;
		  }

		  void printEmployeeDetails() {
		    System.out.println("Employee ID     :  " + emp_id);
		    System.out.println("Employee Name   :  " + name);
		    System.out.println("Employee Age    :  " + age);
		    System.out.println("Employee Salary :  " + emp_salary);
		  }
		

		
		 public static void main(String[] args) {
			 ClassandObject emp = new ClassandObject(10, "venkat", 21, 818601);
		    emp.printEmployeeDetails();
		 
		  }
		

}
