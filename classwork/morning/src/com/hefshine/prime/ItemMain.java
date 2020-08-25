package com.hefshine.prime;

import java.util.Scanner;

public class ItemMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
System.out.println("enter nummber of Item");
int count=0;
count=scan.nextInt();

		Item item[]=new Item[count];
		for(int i=0;i<item.length;i++)
		{
			item[i]=new Item();
			
			System.out.println("enter id");
			item[i].Iid=scan.nextInt();
			System.out.println("enter name");
			item[i].Iname=scan.next();
			System.out.println("enter expire date");
			item[i].IEdate=scan.next();
			//System.out.println("count");
		
		
		}
			for(int i=0;i<item.length;i++)
			{
				
				System.out.println("============================");
				
				System.out.println(item[i]);
			}
		
		System.out.println("update item details.............. ");
		System.out.println("enter id for updated details");
		int tid=scan.nextInt();
		for(int i=0;i<item.length;i++)
		{
			if(tid==item[i].Iid)
			{
				System.out.println("enter name");
				item[i].Iname=scan.next();
				System.out.println("enter expire date");
				item[i].IEdate=scan.next();
			}
		}
		for(int i=0;i<item.length;i++)
		{
			
			System.out.println("============================");
			
			System.out.println(item[i]);
		}

	}

}
