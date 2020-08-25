package com.hefshine.prime;

import java.util.Scanner;

public class Primedemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count1=0,sum=0;
		 Scanner sc = new Scanner(System.in);
		    int[] a = new int[13];
	
		    for (int i = 0; i < a.length; i++) {
		      a[i] = sc.nextInt();
		    }
		    
		    for (int i = 2; i < a.length; i++)
		    {
		       int  count = 0;
		        for (int j = 1; j <= i; j++)
		        {
		          if (i % j == 0)
		          {
		            count++;
		          }
		        }
		    if (count == 2)
		     {
		       sum = sum + a[i];
		         
		     }
		  }
		    
		   System.out.println("  sum is "+sum);
		   
		    
		   
	}

}
