package com.hefshine.methods;
class Square
{
	int length,area_Square;
	void input_Length(int le)
	{
		this.length=le;
		System.out.println("length is " +length);
	}
		void calculateArea()
	{
		area_Square=length*length;
		System.out.println("Area of Square is " +area_Square);
	}
}
public class SquareDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		s.input_Length(10);
		s.calculateArea();


	}

}
