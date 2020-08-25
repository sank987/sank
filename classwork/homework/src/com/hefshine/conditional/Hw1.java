package com.hefshine.conditional;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print(" first number:");
        a = s.nextInt();
        System.out.print(" second number:");
        b = s.nextInt();
        System.out.print(" third number:");
        c = s.nextInt();
        if(a > b && a > c)
        {
            System.out.println("Largest number is:"+a);
        }
        else if(b > c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }
 
	}

}
