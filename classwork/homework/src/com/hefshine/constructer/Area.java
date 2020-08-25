package com.hefshine.constructer;

 class ShapeCircle {

	float pi;
	static float radius;
	
	ShapeCircle(float radius) {
		
		this.radius = radius;
		System.out.println(" 1st constructer radius is "+radius);

	}
	 

	ShapeCircle(float pi, float radius) {
		this(radius);
		this.pi = pi;
		this.radius = radius;
		System.out.println(" 2nd constructer pi value is  "+pi+ " 2nd constructer radius value is "+radius);

	}
 }
 class Area
 {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub

		 ShapeCircle ss=new ShapeCircle(3.14f,10.0f);
		 

	}

 }

	