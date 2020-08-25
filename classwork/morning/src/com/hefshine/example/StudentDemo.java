package com.hefshine.example;
class Student1
{
	int rollno;
	String name;
	String contact;
	int marks;
	
      void inputdata(int rn,String nm,String con,int mark)
	{
		rollno=rn;
		name=nm;
		contact=con;
		marks=mark;
		
	}
	 void display()
	 {
		 System.out.println("rollno"+rollno);
		 System.out.println("name"+name);
		 System.out.println("contact"+contact);
		 System.out.println("marks"+marks);
	 }
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student1 s1=new Student1();
          s1.inputdata(1,"sanket","8578945612",600);
          s1.display();
	}

}
