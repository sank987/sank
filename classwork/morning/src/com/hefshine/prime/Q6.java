package com.hefshine.prime;

import java.util.Scanner;

public class Q6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;

		Scanner sc =new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter numbers ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
				sum=sum+a[i];
				
				
			
		}
		System.out.println("All  numbers sum is "+sum);

	}

}
