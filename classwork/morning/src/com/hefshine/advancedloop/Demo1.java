package com.hefshine.advancedloop;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, countj=0;
		for(int l=1;l<=2;l=l+1)
		{
		for(int k=1;k<=3;k=k+1)
		{
		for(int j=1;j<=5;j=j+1)
		
		{
			for(int i=11;i<=55;i=i+11)
			{	
				count=count+1;
				System.out.print(i+" ");
				
			}
			countj=countj+1;
			System.out.println();
		}
		System.out.println();
		
		}
		System.out.print(count+" ");
		System.out.print(countj+" ");
	}}

}
