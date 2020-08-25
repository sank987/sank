package com.hefshine.iterations;

public class Q5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1 = 0,count2=0,count3=0;
		
		for(int i=33;i<=999;i++)
		{
			if(i%3==0)
			{
				count1++;
				System.out.println(" Pink");
				
			}
			else if(i%5==0)
			{
				count2++;
				
				System.out.println(" Yellow");
				
			}
			else if(i%3==0 && i%5==0)
			{
				count3++;
				
				System.out.println(" Pink and Yellow");
				
			}
			else
			{
			System.out.println(i);
			}
			
		}
System.out.println("pink count is =" +count1);
System.out.println("yellow count is =" +count2);
System.out.println("pink and yellow count is =" +count3);
	}

}
