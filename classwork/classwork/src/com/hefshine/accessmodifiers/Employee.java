package com.hefshine.accessmodifiers;



public class Employee {

	protected int emp_id;
	public  String emp_name;
	private int emp_salary;
	 String emp_department;
	
	 public void do_public(int id1)
	 {
		 this.emp_id=id1;
		 System.out.println("Emp id is "+emp_id);
	 }
	  void do_Default(String s1)
	 {
		 this.emp_name=s1;
		 System.out.println("Emp name is "+emp_name);
	 }
	 protected void do_Protected(int sal)
	 {
		 this.emp_salary=sal;
		 System.out.println("Emp salary is "+emp_salary);
	 }
	private void do_Private(String dep)
	{
		this.emp_department=dep;
		 System.out.println("Emp department is "+emp_department);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
	
		e1.do_Default("sanket");
		e1.do_Private("account");
		e1.do_Protected(500000);
		e1.do_public(10);
		
		
		
	}
}
