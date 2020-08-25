package com.hefshine.iterations;

import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the number =");
        n = s1.nextInt();
        
		int r=0,s=0;
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
			
		}
if(t==s)
{
	System.out.println("Number is palindrome");
	
}
else
{
	System.out.println("Number is Not palindrome");	
}
	}

}
