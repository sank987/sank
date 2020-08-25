package com.hefshine.interfacesession;
class demo11
{
	static
	{
		System.out.println("static 2 bolck");
		
	}
	{
		System.out.println("Instance 2 bolck");
	}
	demo11()
	{
		
		
			System.out.println("Constructer parent  bolck");
		
		
	}
}
public class Demo1 extends demo11{

	static
	{
		System.out.println("static bolck");
		
	}

	
	{
		System.out.println("Instance  bolck");
	}
	
	Demo1()
	{
		System.out.println("Constructer bolck");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		
		System.out.println("This is a main");
	}

}
