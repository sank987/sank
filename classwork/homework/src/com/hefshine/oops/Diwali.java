package com.hefshine.oops;

import java.util.Scanner;

public class Diwali {
	
	
		int ser;
	    float sal;
	    float totalsal;
		Scanner s = new Scanner(System.in);

		void salary1()
		{
	    System.out.print("Enter a service");
	    ser= s.nextInt();
	    System.out.print("Enter a salary");
	    sal= s.nextFloat();
		
	     
	    if(ser>5)
		{
			totalsal=sal+(sal*0.35f);
			System.out.println(""+totalsal);
		}
		else if(ser<5)
		{
			totalsal=sal+(sal*0.15f);
			System.out.println(""+totalsal);
		}
		
		}
	

public static void main(String[] args) {
	
	Diwali d1=new Diwali();
	d1.salary1();
}
}