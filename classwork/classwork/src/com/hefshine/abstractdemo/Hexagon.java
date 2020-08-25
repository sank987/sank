package com.hefshine.abstractdemo;
abstract class Shape
{
	abstract void numberOfSide();
}
class Trapezoid extends Shape
{

	void numberOfSide() {
	System.out.println("Number of sides of Trapezoid is 4");
	}
	
}
class Triangle extends Shape
{

	void numberOfSide() {
	System.out.println("Number of sides of Triangle is 3");
	}
	
}

public class Hexagon extends Shape{
	
	
	void numberOfSide() {
		System.out.println("Number of sides of Hexagon is 6");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hexagon h1=new Hexagon();
h1.numberOfSide();

Triangle t1=new Triangle();
t1.numberOfSide();

Trapezoid trap1=new Trapezoid();
trap1.numberOfSide();

	}

	

}
