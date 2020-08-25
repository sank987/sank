package com.hefshine.conditional;

import java.util.Scanner;

public class Cw4 {

	public static void main(String[] args) {
		double unit;
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("enter number of units");
	    unit=sc.nextDouble();
	    
		float bill;
		
		if(unit<=50)
		{
		    bill=(float) (unit * 0.50);
		    System.out.println("Bill is = "+bill);
		}
		if((50<unit)&& (unit<=150))
		{
		    bill=(float) (50*0.50+(unit-50)*0.75);
		    System.out.println("Bill is = "+bill);
		}
		if((150<unit)&& (unit<=250))
		{
		    bill=(float) (50*0.50+150*0.75+(unit-150)*1.20);
		    System.out.println("Bill is = "+bill);
		}
		if(250<unit)
		{
		    bill=(float) (50*0.50+150*0.75+250*1.20+(unit-250)*1.50);
		    System.out.println("Bill is = "+bill);
		}
		}
		

	

}
