package Day1;

import java.util.Scanner;



public class Datatypes {
	
	
	public static  void method1() {
		
		int Num;
	    String st;
	    char ch;
	    boolean b;
	    float f;
	    
//	   Scanner sc= new Scanner(System.in);
//	   System.out.println("enter integer ");
//	   Num= sc.nextInt();
//	   System.out.println("enter string ");
//	   st= sc.next();
//	   System.out.println("enter boolean ");
//	   b= sc.nextBoolean();
//	   System.out.println("enter float ");
//	   f= sc.nextFloat();
//	   System.out.println("entered char");
//	   
//	   ch =sc.next().charAt(0);
//	   System.out.println("entered integer "+" "+ Num);
//	   System.out.println("entered string "+" "+ st);
//	   System.out.println("entered boolean "+" "+ b);
//	   System.out.println("entered float "+" "+ f);
//	   System.out.println("entered char" + " "+ch);
	   
	   
	   
	   
	}
	public static void table() {

        int Num1;
        System.out.println("enter number for multiplication");
        Scanner sc= new Scanner(System.in);
        Num1=sc.nextInt();
        
        for(int i = 1; i <= 10;i++)
        {
            System.out.printf(Num1+" * "+i+" = "+Num1*i+"\n" );
        }
	}
	
	public static void evenodd() {
		int Num;
        System.out.println("enter number for check");
        Scanner sc= new Scanner(System.in);
        Num=sc.nextInt();
		
        if (Num%2==0){
        	System.out.println(" even number");
        	
        }
        else {
        	System.out.println("odd number");
        }
		
		
	}
}
