package com.hefshine.matrix;

import java.util.Scanner;

public class Q6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int sum=0;
int arr[][]={
		{1,2,3},
		{4,5,6},
		{7,8,9},
};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{		
				System.out.print(arr[i][j]+"\t");
				
				
			}
			System.out.println( );
		}
		System.out.println("==========================================");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{		
				if((i+j)==(arr.length-1))
				{
				sum=sum+arr[i][j];	
				}
			}
			System.out.println( );
		}
		System.out.print("sum is"+sum);
	}

}
