package com.hefshine.methods;
class SuperCal{
	int calculateSum(int number1,int number2)
	{
		return number1+number2;
		
	}
	int cal_Difference(int number1,int number2)
	{
		return number2-number1;
		
	}
}
public class NewCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCal c2=new SuperCal();
		System.out.println("Sum " +c2.calculateSum(10, 20));
		System.out.println("Difference " +c2.cal_Difference(10, 20));
	}

}
