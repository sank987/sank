package com.hefshine.constructer;

public class Programing {

	String name;
	

 Programing() {
System.out.println(" I Want To Learn Language");

	}

 Programing(String name) {
		
		this.name = name;
		
		System.out.println(" I Want To Learn " +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programing p =new Programing("java");
		
	}

}
