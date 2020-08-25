package com.hefshine.abstractdemo;
abstract class Vehicale
{
	abstract void numWheels();
}
class Car extends Vehicale
{

	void numWheels() {
		System.out.println("car is a 4 wheeler");
		
		
	}
	
}
public class Truck extends Vehicale{
	void numWheels() {
		System.out.println("Truck is a 8 wheeler");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.numWheels();
		
		Truck t1=new Truck();
		t1.numWheels();
		

	}

}
