package Day9Exceptions;

import java.util.Scanner;

public class quantity {

	
	int qty=(new Scanner(System.in).nextInt());
	
	public void checkQuantity() throws ExceptionParant {
		if (qty<1) {
			throw new ExceptionParant("stock empty");
		}
	}
}
