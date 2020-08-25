package com.hefshine.inheritance;

class Abc
{
   public void methodAbc()
   {
      System.out.println("method of Class A");
   }
}
class Xyz extends Abc
{
   public void methodXyz()
   {
      System.out.println("method of Class B");
   }
}
class Pqr extends Abc 
{
  public void methodPqr()
  {
     System.out.println("method of Class C");
  }
}

public class Hierarchical 
{
  public static void main(String args[])
  {
     Xyz ob1 = new Xyz();
     Pqr ob2 = new Pqr();
     
     //All classes can access the method of class A
     ob1.methodAbc();
     ob2.methodAbc();
    
  }
}

