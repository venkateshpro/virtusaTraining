package Day9Exceptions;

import Day2.mainc;

public class app {
	public static void main(String[] args) {
		quantity q= new quantity();
		
		try {
			q.checkQuantity();
		} catch (ExceptionParant e) {
			// TODO Auto-generated catch block
			//System.out.println("out of stock dear");
			e.printStackTrace();
		}
		
	}

}
