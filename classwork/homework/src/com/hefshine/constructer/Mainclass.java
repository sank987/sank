package com.hefshine.constructer;
class Bank
{
	int amount=5000;
	int add_amount,balance;
	Bank()
	{
		System.out.println("1st class Defult constructer");
		
	}
	Bank(int am)
	{
		this();
		this.add_amount=am;
		System.out.println("1st class Parameter constructer");
		balance=amount+add_amount;
		System.out.println("balance is "+balance);
		
	}
}
class Addamount extends Bank
{

	 Addamount(int a) {
		super(a);
		System.out.println("2nd class constructer");
		
	}
	
	
}
public class Mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addamount a1=new Addamount(10);

	}

}
