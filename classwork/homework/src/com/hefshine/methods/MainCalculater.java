package com.hefshine.methods;
class Calculater 
{
	double addition(int num1,int num2)
	{
		return num1+num2;
		
	}
	double substraction(int num1,int num2)
	{
		return num1-num2;
		
	}
	double multiplication(int num1,int num2)
	{
		return num1*num2;
		
	}
	double division(int num1,int num2)
	{
		return num1/num2;
		
	}
}
public class MainCalculater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculater c1=new Calculater();
		
System.out.println("Addition " +c1.addition(10, 20));
System.out.println("Substraction " +c1.substraction(20, 5));
System.out.println("Multiplication " +c1.multiplication(6, 8));
System.out.println("Division " +c1.division(80, 16));

	}

}
