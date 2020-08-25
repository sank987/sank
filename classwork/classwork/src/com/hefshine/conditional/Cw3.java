package com.hefshine.conditional;

import java.util.Scanner;

public class Cw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sal,g_sal;
		System.out.println("Enter Basic salary:");
		
		Scanner input = new Scanner(System.in);
		
		sal = input.nextFloat();
		System.out.println(" Basic salary is =:"+sal);
		
		if(sal<=10000)
		{
			g_sal = sal+(sal*0.2f)+(sal*0.8f);
			System.out.println("Gross salary = "+g_sal);
		}
		else if((sal>10000)&&(sal<=20000))
		{
			g_sal = sal+(sal*0.25f)+(sal*0.9f);
			System.out.println("Gross salary = "+g_sal);
		}
		else if(sal>=20000)
		{
			g_sal = sal+(sal*0.3f)+(sal*0.95f);
			System.out.println("Gross salary = "+g_sal);
		}
		}

	
}


