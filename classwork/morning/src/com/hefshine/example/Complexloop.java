package com.hefshine.example;

public class Complexloop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i=0,j = 0;
		int count=0;
		int counti=0;
		int countj=0;
		
		for(i =1;i<=5;  i=i+2)
		{
		for(j= 1;j<=10; j=j+3)
		{
			    j=j-1;
			    count=count+1;
			    countj=countj+1;
				
		}	  
		 counti=counti+1;
		
		}	
		 System.out.println("value of i"+i); 
		 System.out.println("value of j"+j); 
		 System.out.println("value of count"+count); 
		 System.out.println("value of count of i"+counti);
		 System.out.println("value of count of j"+countj);
	}

}
