package com.hefshine.advancedloop;

public class Demopractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
        for (int i = 1; i <= 4; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

	}

}
