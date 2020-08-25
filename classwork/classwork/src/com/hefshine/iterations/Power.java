package com.hefshine.iterations;

import java.util.Scanner;

public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int num1=num*num;
        System.out.println("Power of " +num+ " is " +num1);

	}

}
