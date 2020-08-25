package com.hefshine.matrix;

import java.util.Scanner;

public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int sum=0;
int arr[][]=new int[3][3];
				
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{		
				System.out.println( "enter elements ");
				arr[i][j]=scan.nextInt();
				
			}
			System.out.println( );
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{		
				System.out.print(arr[i][j]+"\t");
				
				
			}
			System.out.println( );
		}
		
	}

}
