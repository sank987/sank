package com.hefshine.methods;
class Account 
{ 
	int account_No;
   String bank_Name;
   float total_Amount;
   float withdraw_Amount;
   float deposite_Amount;
   
	void inserData(int an,String bn,float ta,float wa,float da)
	{
		        this.account_No=an;
		        this.bank_Name=bn;
		        this.total_Amount=ta;
		        this.withdraw_Amount=wa;
		        this.deposite_Amount=da;
		   
		
	}
	void displayData()
	{
		System.out.println(""+account_No+" "+bank_Name+" "+total_Amount+" "+withdraw_Amount+" "+deposite_Amount+"");
		
		
	}
	void depositeAmount()
	{
		System.out.println(" "+deposite_Amount+" Amount is a deposited");
		
	}
	void withdrawAmount()
	{
		System.out.println(" "+withdraw_Amount+"Amount is a withdraw");
	}
	void accountBalance()
	{
		System.out.println("Total amount is "+total_Amount+"");
	}
}
public class AccountInfo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		acc.inserData(123456, "SBI", 50000, 10000, 40000);
		acc.displayData();
		acc.depositeAmount();
		acc.withdrawAmount();
		acc.accountBalance();
		

	}

}
