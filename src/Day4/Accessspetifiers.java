package Day4;

import Day3.main;

public class Accessspetifiers {
	
	
	
	private int a=10;// global scope
	public String name="venkat";
	protected boolean r=true;
	double x = 10;
	
	public void fun1(){
		int l;//these is the block scope 
	}
	
	//l=20;//unable to find becz local variable 
	
}

