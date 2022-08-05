package Day2;

public class operators {
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void athamatic_Operations() {
		
		//addition
		System.out.println((a + b));
	
	    // subtraction operator
	    System.out.println(a - b);
	
	    // multiplication operator
	    System.out.println(a*b);
	
	    // division operator
	    System.out.println(a/b);
	
	    // modulo operator
	    System.out.println(a % b);
	}
	
	public void relational_Operators() {
		if (a==b) {
			System.out.println("a, b are same");
		}
		else if(a != b) {
			System.out.println("a,b are not same");
		}
		else if(a>=b) {
			System.out.println("a is gratter or equal to b ");
		}
		else if(b>=a) {
			System.out.println("b is gratter or equal to a");
		}
	}
	public void logical_Operators() {

	    // && operator
	    System.out.println((a > b) && (a > b));  
	    System.out.println((a > b) && (a < b)); 

	    // || operator
	    System.out.println((a < b) || (a > b));  
	    

	    // ! operator
	    System.out.println(!(a == b)); 
	    	     
	}

}

