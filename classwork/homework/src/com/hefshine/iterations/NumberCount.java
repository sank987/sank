package com.hefshine.iterations;

import java.util.Scanner;

public class NumberCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = 0;
		 int num;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number =");
	        num= s.nextInt();

	        while(num > 0)
	        {
	            num = num/10;
	            count++;
	        }

	        System.out.println("Number of digits: " + count);
	    

	}

}
