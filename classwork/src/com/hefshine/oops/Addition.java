package com.hefshine.oops;
class AdditionDemo {

    int num1,num2,result;
    
    void add()
    {
    	result=num1+num2;
    	System.out.println(""+result);
    }	
    
    void subtraction()
    {
    	result=num2-num1;
    	System.out.println(""+result);
    	
    }
    void multiplication()
    {
    	result=num2*num1;
    	System.out.println(""+result);
    }
    void division()
    {
    	result=num2/num1;
    	System.out.println(""+result);
    	
    }

}

public class Addition {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionDemo ad=new AdditionDemo();
		ad.num1=10;
		ad.num2=30;
		
		
		ad.add();
		ad.subtraction();
		ad.multiplication();
		ad.division();
		

	}

}
