package com.hefshine.conditional;

import java.util.Scanner;

public class Hw7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the side a");
		int a=sc.nextInt();
		System.out.println("enter the side b");
		int b=sc.nextInt();
		System.out.println("enter the side c");
		int c=sc.nextInt();
		
		 if (a==b && b==c)
		 {
			 System.out.println("The triangle is an equilateral ");
		 }
		 if ((a==b && b!=c && a!=c) || (b==c && b!=a && c!=a) || (c==a & c!=b && a!=b))
		 {
			 System.out.println("The triangle is an isosceles ");
		 }
		 if (a!=b && a!=c && b!=c)
		 {
			 System.out.println("The triangle  is a scalene ");
		 }

	}

}
