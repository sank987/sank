package com.hefshine.conditional;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner(System.in);
		    System.out.println(" enter i ");
			i=sc.nextInt();
			System.out.println("i ="+i);
			
			System.out.println(" enter j ");
			j=sc.nextInt();
			System.out.println("j ="+j);

		     if(i> j)
	                System.out.println(i+" is greater");
	          else
	                 System.out.println(j+" is greater ");
	}

}
