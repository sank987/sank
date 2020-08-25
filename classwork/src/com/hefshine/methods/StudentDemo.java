package com.hefshine.methods;
class Student
{
	int rollno;
	String name;
	String contactno;
	int marks;
	
	void input_data(int rno,String nm,String con,int m)
	{
		this.rollno=rno;
		this.name=nm;
		this.contactno=con;
		this.marks=m;
		
	}
	void display_data()
	{
		System.out.println(""+rollno+" "+name+" "+contactno+" "+marks+" ");
	}
}
public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.input_data(101, "sanket", "7894561233", 600);
		s1.display_data();

	}

}
