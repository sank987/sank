package com.hefshine.advancedloop;


class Father{
	
	public void home(){
		System.out.println("Father's home");
	}
	public void car(){
		System.out.println("Father's Car");
	}	
}
class Son extends Father{
	
	
	public void car() {
		System.out.println("Son's Car");		
	}	
}
public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.home();
		s.car();

	}

}
