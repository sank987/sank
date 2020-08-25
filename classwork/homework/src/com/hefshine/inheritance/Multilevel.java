package com.hefshine.inheritance;

class FirstClass
{
   public void firstClassMethod()
   {
     System.out.println("Class FirstClass method firstClassMethod");
   }
}
class SecondClass extends FirstClass
{
public void secondClassMethod()
{
System.out.println("class SecondClass method secondClassMethod");
}
}
class Multilevel extends SecondClass
{
   public void multilevelMethod()
   {
     System.out.println("class Multilevel method multilevelMethod");
   }
   public static void main(String args[])
   {
	   Multilevel mul = new Multilevel();
	   mul.firstClassMethod(); 
	   mul.secondClassMethod(); 
	   mul.multilevelMethod(); 
  }
}
