package com.hefshine.example;

public class tp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=10;
int c=20;
int i=2;
int result=0;
result=(a*=i--)*5 * ++i*i - (c*=2*i)*i--*++i;
	System.out.println(result);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}

}
