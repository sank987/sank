package com.hefshine.matrix;

import java.util.Scanner;

public class Q9 {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
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
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{		
				
				sum=sum+arr[i][j];	
				
			}
			System.out.println("sum of "+ (i+1) +" Row is " + sum);
			System.out.println( );
		}
		
	}

}
