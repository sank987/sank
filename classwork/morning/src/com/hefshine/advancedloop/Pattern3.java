package com.hefshine.advancedloop;

public class Pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0;
		for(int j=1;j<=3;j++)
		{
			
		for(int i=1;i<=3;i++)
		{
			count=count+1;
			if(i==1)
			{
				sum= sum + count ;
			}
			System.out.print(count+" ");
		}
		System.out.println();
		}
		System.out.println("sum of 1st column is : " +sum);

	}

}
