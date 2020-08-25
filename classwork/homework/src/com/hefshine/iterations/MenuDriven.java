package com.hefshine.iterations;

import java.util.Scanner;

public class MenuDriven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n = 0;
		
		System.out.println("Select Number 1  2  3");
		System.out.println("1) Even Numbers");
		System.out.println("2) Odd Numbers");
		System.out.println("3) Prime Numbers");
		
		 Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number =");
	        n = s.nextInt();
		
		
	if(n==1)
	{
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				
				System.out.println(i);
			}
		}
	}	
		
	if(n==2)
	{
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
	if(n==3)
	{
	       int num =0;
	       //Empty String
	     

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
			  System.out.println(i);
		  }	
	       }	
	      
		
	}	
	}

}
