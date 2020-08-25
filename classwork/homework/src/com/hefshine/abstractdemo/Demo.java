package com.hefshine.abstractdemo;

import com.hefshine.arithmetic.*;

public class Demo  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad=new Addition();
		ad.add(10,10);
		ad.add_Display();
		
		Substraction sb=new Substraction();
		sb.substraction(20, 10);
		sb.sub_Display();
		
		Multiplication mu=new Multiplication();
		mu.multiplication(10, 5);
		mu.mul_Display();
		
		Division di=new Division();
		di.division(50, 5);
		di.div_Display();
		
		

	}

}
