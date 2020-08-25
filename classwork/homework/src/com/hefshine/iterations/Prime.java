package com.hefshine.iterations;

import java.util.Scanner;

public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number =");
        n = s.nextInt();
		int temp=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(n+ " Number is not prime");
			
		}
		else
		{
			System.out.println(n+ " Number is prime");	
		}
	}

}

