package com.hefshine.abstractdemo;

import java.util.Scanner;

interface VotingApp
{
	void registerUser();
	void requestVotingNumber();
	
	
}
class Kids implements VotingApp
{
int age;

	public void registerUser() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		age=s.nextInt();
		if(age<12)
		{
			System.out.println("You have successfully register under Kids");
		}
		else if(age>12)
		{
			System.out.println("You have not successfully register under kids");
		}
		
	}

	public void requestVotingNumber() {
		// TODO Auto-generated method stub
		System.out.println("sorry.....Can not go for voting bcoz age must be greater than 12 to vote");
	}
	
}
class Adult implements VotingApp
{
int age;

	public void registerUser() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		age=s.nextInt();
		
		if(age>12)
		{
			System.out.println("You have successfully register under Adult");
		}
		else if(age<12)
		{
			System.out.println("You have not successfully register ");
		}
		
	}

	public void requestVotingNumber() {
		// TODO Auto-generated method stub
		if(age>12)
		{
		System.out.println("Your Voting Id is Genrated within a Day....thank you....!");
		}
		else if(age<12)
		{
		System.out.println("Oops you are not Adult....!");
		}
	}
		
	
}
public class VotingAppDemo {
	
	public static void main(String[] args) {
	
Kids ki=new Kids();

ki.registerUser();
ki.requestVotingNumber();

Adult ad=new Adult();

ad.registerUser();
ad.requestVotingNumber();

	}

}
