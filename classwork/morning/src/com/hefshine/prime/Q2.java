package com.hefshine.prime;

import java.util.Scanner;

public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc = new Scanner(System.in);
		int size = 0;
		 System.out.println("Enter Size of Array"+size);
		 size=sc.nextInt();
		 
		    int[] a = new int[size];
		    System.out.println(" Enter Numbers");
		    for (int i = 0; i < a.length; i++) 
		    {
		      a[i] = sc.nextInt();
		    }
		    for (int i = 0; i < a.length; i++) 
		    {
		    	System.out.println(" Array Element is "+a[i]); 
		    }
	}

}
