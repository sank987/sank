package com.hefshine.conditional;

import java.util.Scanner;

public class Hw10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch ='U';
		
		 /*Scanner sc = new Scanner(System.in);
		 System.out.print("Enter an input ");
		 ch = sc.next().charAt(0);*/
		
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
		{
	            System.out.println(" Alphabet "); 
		}
	        
	        else if (ch >= '0' && ch <= '9') 
	        {
	            System.out.println(" Digit "); 
	        }
	        
	        else
	            System.out.println(" Special Character "); 
	    } 

	}


