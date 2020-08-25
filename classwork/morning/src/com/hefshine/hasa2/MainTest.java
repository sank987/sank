package com.hefshine.hasa2;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Books b1=new Books();
		b1.id=1;
		b1.brand="B1 abc1";
		b1.cost=50;
		
	
		Books b2=new Books();
		b2.id=2;
		b2.brand="B2 abc2";
		b2.cost=70;
		
		Rack rack1=new Rack();
		rack1.id=1;
		rack1.books=b1;
		
		Rack rack2=new Rack();
		rack2.id=2;
		rack2.books=b2;
		
		
		Bookshell bshell1=new Bookshell();
		bshell1.id=101;
		bshell1.name="BookShell no. 1";
		bshell1.brand="tom";
		bshell1.hight=5;
		bshell1.width=6;
		bshell1.rack=rack1;
		bshell1.books=b1;
		
		Bookshell bshell2=new Bookshell();
		bshell2.id=102;
		bshell2.name="BookShell no. 2";
		bshell2.brand="rom";
		bshell2.hight=5;
		bshell2.width=6;
		bshell2.rack=rack2;
		bshell2.books=b2;
		
		
		System.out.println(bshell1.id);
		System.out.println(bshell1.brand);
		System.out.println(bshell1.name);
		System.out.println(bshell1.hight);
		System.out.println(bshell1.width);
		System.out.println(bshell1.rack.id);
		System.out.println(bshell1.rack.books.id);
		System.out.println(bshell1.rack.books.brand);
		System.out.println(bshell1.rack.books.cost);
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println(bshell2.id);
		System.out.println(bshell2.brand);
		System.out.println(bshell2.name);
		System.out.println(bshell2.hight);
		System.out.println(bshell2.width);
		System.out.println(bshell2.rack.id);
		System.out.println(bshell2.rack.books.id);
		System.out.println(bshell2.rack.books.brand);
		System.out.println(bshell2.rack.books.cost);
	
		

	}

}
