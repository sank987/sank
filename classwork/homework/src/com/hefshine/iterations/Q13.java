package com.hefshine.iterations;

public class Q13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0,i=0;
		
		//for 1st pattern
		for(int j=1;j<=5;j++)
		{
			
		for( i=1;i<=j;i++)
		{
			count=count+1;
			
			System.out.print(1);
		}
		System.out.println();
		}
		
		//2nd pattern
		
		for(int j=4;j>=1;j--)
		{
			
		for( i=1;i<=j;i++)
		{
			count=count+1;
			
			System.out.print(1);
		}
		System.out.println();
		}

	}

}
