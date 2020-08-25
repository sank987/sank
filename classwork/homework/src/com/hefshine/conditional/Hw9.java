package com.hefshine.conditional;

import java.util.Scanner;

public class Hw9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		char operator;
		 double output;
		 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;
                
            default:
                System.out.println(" wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+"="+output);

	}

}
