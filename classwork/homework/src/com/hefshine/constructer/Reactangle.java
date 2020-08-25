package com.hefshine.constructer;

public class Reactangle {

	int length,breadth,result ;
	
	void area(int l,int b)
	{
		this.length=l;
		this.breadth=b;
		System.out.println("length is  "+length+" breadth is "+breadth);
	}
	void display()
	{
		result=length*breadth;
		System.out.println("Area is "+result);
		
		
	}
	Reactangle()
	{
		System.out.println("defult constructer");
		System.out.println("length is  "+length+" breadth is "+breadth);
	}
	Reactangle(int le,int br)
	{
		System.out.println("1st paramater constructer values and area is ");
		this.length=le;
		this.breadth=br;
		
		System.out.println(" length is "+length+"breadth is "+breadth);
		result =length*breadth;
		System.out.println("Area is "+result);
		
	}
	Reactangle(int lb)
	{
		System.out.println("2nd paramater constructer values and area is ");
		this.length=this.breadth=lb;
		
		System.out.println(" length is "+length+"breadth is "+breadth);
		result =length*breadth;
		System.out.println("Area is "+result);
		
	}
	public static void main(String[] args) {
		Reactangle r1=new Reactangle();
	
		Reactangle r3=new Reactangle(10,5);
		Reactangle r4=new Reactangle(5);
	
		r1.area(10, 5);
		r1.display();
		
	}

}
