package com.hefshine.abstractdemo;
abstract class Shape
{
	abstract float calArea(float a);
	void display()
	{
		System.out.println("abstract class method");
		
	}
	
}
class Squre extends Shape
{

	float calArea(float a) {
		return a*a;
		
	}
	
}
class Circle extends Shape
{

	float calArea(float a) {
		
		return (float) (3.14*a*a);
	}
	
}
public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape shape=new Circle();
		System.out.println(shape.calArea(2.0f));
		//Shape shape=new Squre();
		shape=new Squre();
		System.out.println(shape.calArea(2.0f));
		

	}

}
