package com.hefshine.methods;
class SuperArea
{
	float area(float a)
	{
		return a*a;
	}
	float area(int l,int w)
	{
		return l*w;
	}
	float area(float b,float h)
	{
		return (b*h)/2;
	}
}
public class MainMethod 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SuperArea s1=new SuperArea();
 System.out.println("Area of Square is : " +s1.area(10));
 System.out.println("Area of rectangle is : " +s1.area(5, 6));
 System.out.println("Area of triangle is : " +s1.area(14, 7));
	}

}
