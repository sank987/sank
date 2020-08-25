package com.hefshine.conditional;

import java.util.Scanner;

public class Hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Selling_Price, Actual_Cost, amount;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Actual Cost  ");
		Actual_Cost = sc.nextFloat();	
		
		System.out.print(" Enter the Selling Price  ");
		Selling_Price = sc.nextFloat();
		
		if(Selling_Price > Actual_Cost )
		{
			amount = Selling_Price - Actual_Cost;
			System.out.println("\n Profit Amount =  " + amount);
		}
		else if(Actual_Cost > Selling_Price)
		{
			amount = Actual_Cost - Selling_Price;
			System.out.println("\n Loss Amount =  " + amount);
		}
		else
		{
			System.out.println("\n No Profit No Loss! ");
		}

	}

}
