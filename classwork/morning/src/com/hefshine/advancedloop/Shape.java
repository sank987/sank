package com.hefshine.advancedloop;

class Shape {
void m1()
{
	System.out.println("Super m1 method....");
	
}
void m2()
{
	System.out.println("Super m2 method....");
	
}
void super1()
{
	System.out.println("Super 3 method....");
	
}
}
class Squre extends Shape 
{
	void m1()
	{
		System.out.println("child m1 method....");
		
	}
	void m2()
	{
		System.out.println("child m2 method....");
		
	}
	void child()
	{
		System.out.println("child 3 method....");
		
	}
}