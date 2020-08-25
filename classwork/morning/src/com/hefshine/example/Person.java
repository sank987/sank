package com.hefshine.example;

 class Per {
	int id;
	String name;
	String add;
	String contact;
	char gender;
	
}
class Student extends Per
{
	int  rollno;
	int enrollment_no;
	int marks;
	String subject;
	char grade;
	
	void study()
	{
		System.out.println(""+name+"----doing study-----");
		
	}
	void play()
	{
		System.out.println(""+name+"----doing playing-----");
		
	}
	void assignment()
	{
		System.out.println(""+name+"----doing assignment-----");
		
	}
}
class Employee extends Per
{
	int emp_id;
	int experince;
	String department;
	float salary;
	
	void exp()
	{
		System.out.println(""+name+""+experince +" years experince");
		
	}
	void presentation()
	{
		System.out.println(""+name+"doing presentation");
		
	}
	void extra_activities()
	{
		System.out.println(""+name+"doing activities");
		
	}
	
}
public class Person 
{
	public static void main(String[] args) {
		Student nandini =new Student();
		Student vishwnath =new Student();
		Student pawan =new Student();
		
		nandini.id=1;
		nandini.name="nandini";
		nandini.add="pune";
		nandini.contact="7894561231";
		nandini.rollno=101;
		nandini.marks=500;
		nandini.grade='A';
		
		System.out.println(""+nandini.id+""+nandini.name+""+nandini.add+""+nandini.contact+""+nandini.rollno+""+nandini.marks+""+nandini.grade+"");
		
		vishwnath.id=2;
		vishwnath.name="vishwnath";
		vishwnath.add="pune";
		vishwnath.contact="8594561231";
		vishwnath.rollno=102;
		vishwnath.marks=600;
		vishwnath.grade='A';
		
		System.out.println(""+vishwnath.id+""+vishwnath.name+""+vishwnath.add+""+vishwnath.contact+""+vishwnath.rollno+""+vishwnath.marks+""+vishwnath.grade+"");
		
		pawan.id=3;
		pawan.name="pawan";
		pawan.add="pune";
		pawan.contact="9594561231";
		pawan.rollno=103;
		pawan.marks=400;
		pawan.grade='B';
		
		System.out.println(""+pawan.id+""+pawan.name+""+pawan.add+""+pawan.contact+""+pawan.rollno+""+pawan.marks+""+pawan.grade+"");
		
		nandini.study();
		vishwnath.play();
		pawan.assignment();
		
		Employee rajat=new Employee();
		Employee ramesh=new Employee();
		Employee sachin=new Employee();
		
		rajat.id=4;
		rajat.name="rajat";
		rajat.add="pune";
		rajat.contact="9094561231";
		rajat.emp_id=11;
		rajat.experince=5;
		rajat.salary=50000;
		
		System.out.println(""+rajat.id+""+rajat.name+""+rajat.add+""+rajat.contact+""+rajat.emp_id+""+rajat.experince+""+rajat.salary+"");
		
		ramesh.id=5;
		ramesh.name="ramesh";
		ramesh.add="pune";
		ramesh.contact="7094561231";
		ramesh.emp_id=12;
		ramesh.experince=3;
		ramesh.salary=30000;
		
		System.out.println(""+ramesh.id+""+ramesh.name+""+ramesh.add+""+ramesh.contact+""+ramesh.emp_id+""+ramesh.experince+""+ramesh.salary+"");
		
		sachin.id=6;
		sachin.name="sachin";
		sachin.add="pune";
		sachin.contact="7575561231";
		sachin.emp_id=13;
		sachin.experince=4;
		sachin.salary=40000;
		
		System.out.println(""+sachin.id+""+sachin.name+""+sachin.add+""+sachin.contact+""+sachin.emp_id+""+sachin.experince+""+sachin.salary+"");
		
		rajat.exp();
		sachin.presentation();
		ramesh.extra_activities();
		
		
	}
	
}