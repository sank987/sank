package com.hefshine.prime;

import java.util.Scanner;

public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		    int[] a = new int[10];
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
