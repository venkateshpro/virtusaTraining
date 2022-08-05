package Day4;

import java.util.Scanner;

class sample{
	int a;

	public sample(int a) {
		super();
		this.a = a;
	}
	
	
}

public class objasargument {
	
	public void check(sample s) {
		if (s.a>100) {
			System.out.println("user eligible");
		}
		else {
			System.out.println("ur not eligible");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sample s= new sample(800);
		
		
	}
	

}
