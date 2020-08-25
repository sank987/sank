package com.hefshine.inheritance;
class Test1
{
	int num1,num2;
	void data(int a,int b)
	{
		this.num1=a;
		this.num2=b;
	}
}
class Test2 extends Test1
{
	void display()
	{
		System.out.println("num1 is "+ num1 + " num2 is " + num2 + "");
	}
}
public class Test2Demo {

	int num3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2=new Test2();
		t2.data(10, 20);
		//t2.num1=10;
		//t2.num2=30;
		t2.display();
		
		

	}

}
