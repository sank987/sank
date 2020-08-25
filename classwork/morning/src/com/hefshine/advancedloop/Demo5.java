package com.hefshine.advancedloop;

public class Demo5 {

	/**
	 *    1
   11
  111
 1111
11111

	 */
	static  public void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0,i=0;
		for(int j=1;j<=5;j++)
		{
			for( i=4;i>=j;i--)
			{
				System.out.print(" ");
			}
		for( i=1;i<=j;i++)
		{
			count=count+1;
			
			System.out.print(1);
		}
		System.out.println();
		}

	}

}
