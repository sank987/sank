package com.hefshine.matrix;

public class Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[7][];
		
		arr[0]=new int[5];
		arr[1]=new int[5];
		arr[2]=new int[5];
		arr[3]=new int[3];
		arr[4]=new int[5];
		arr[5]=new int[2];
		arr[6]=new int[5];
				
		arr[0][0]=1;
		arr[0][1]=1;
		arr[0][2]=1;
		arr[0][3]=1;
		arr[0][4]=1;
		
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
