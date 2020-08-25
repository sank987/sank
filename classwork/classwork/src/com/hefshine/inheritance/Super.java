package com.hefshine.inheritance;

class Super1
{
	void eat()
	{
	System.out.println("Eating....");
	
	}
}

class Super2 extends Super1
{
     void eat()
     {
    	 System.out.println("Super2 Eating....");
    	 super.eat();
     }

}

public class Super  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super2 s1 = new Super2();
		s1.eat();
		

	}

}
