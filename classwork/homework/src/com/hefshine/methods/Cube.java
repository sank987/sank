package com.hefshine.methods;

public class Cube {

	int hight,width,depth,result;
	void volume_Cube()
	{
		result=hight*width*depth;
		System.out.println(" result is " +result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cy=new Cube();
		cy.hight=10;
		cy.width=20;
		cy.depth=30;
		cy.volume_Cube();
		

	}

}
