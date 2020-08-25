package com.hefshine.constructer;

public class Circle {
	float radius;
	float pi=3.14f;
	float area,circumfernce;
	
	void CircleArea(float r)
	{
		this.radius=r;
		area=pi*radius*radius;
		System.out.println("Area of Circle is "+area);
		
		
	}
	void Circumfernce(float r)
	{
		this.radius=r;
		circumfernce=2*pi*radius;
		System.out.println("circumfernce of Circle is "+circumfernce);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.CircleArea(10);
		c1.Circumfernce(10);
	
	}

}
