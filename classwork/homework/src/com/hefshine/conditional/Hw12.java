package com.hefshine.conditional;

import java.util.Scanner;

public class Hw12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3,m4,m5;
        float total=0, avg;
        Scanner sc = new Scanner(System.in);
		
        
       
           System.out.print("Enter Marks of 5 Subject");
           m1 = sc.nextInt();
           m2 = sc.nextInt();
           m3 = sc.nextInt();
           m4 = sc.nextInt();
           m5 = sc.nextInt();
           
           total = m1+m2+m3+m4+m5;
           System.out.print("The Total is: "+total );
           avg = total/5;
           System.out.print("\n The AVG is: "+avg);
        
       
        System.out.print("\n The  Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.print("D");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.print("E");
        }
        else 
        {
            System.out.print("F");
        }

	}

}
