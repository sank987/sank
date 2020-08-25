package com.hefshine.iterations;

import java.util.Scanner;

public class NumberTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number =");
        n = s.nextInt();
        
        for(int i=1;i<=10;i++)
        {
        	System.out.println("    "+(i*n));
        }
	}

}
