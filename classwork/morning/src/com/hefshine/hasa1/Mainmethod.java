package com.hefshine.hasa1;

public class Mainmethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Address add=new Address();
      add.address_Line1="abc";
      add.address_Line2="xyz";
      add.city="pune";
      add.pincode="411441";
      
      Contact con=new Contact();
      con.contact1="7845127845";
      con.contact2="7894561231";
      con.email_Id="sank@gmail.com";
      con.outlook_Id="sank@outlook.com";
      
      Student s1=new Student();
      s1.rollno=101;
      s1.name="ram";
      s1.address=add;
      s1.contact=con;
      
      Employee emp=new Employee();
      emp.emp_Id=102;
      emp.emp_Name="shree";
      emp.address=add;
      emp.contact=con;
      
      System.out.println(s1.rollno);
      System.out.println(s1.name);
      System.out.println(s1.address.address_Line1);
      System.out.println(s1.address.address_Line2);
      System.out.println(s1.address.city);
      System.out.println(s1.address.pincode);
      System.out.println(s1.contact.contact1);
      System.out.println(s1.contact.contact2);
      System.out.println(s1.contact.email_Id);
      System.out.println(s1.contact.outlook_Id);
      
     
      System.out.println(emp.emp_Id);
      System.out.println(emp.emp_Name);
      System.out.println(emp.address.address_Line1);
      System.out.println(emp.address.address_Line2);
      System.out.println(emp.address.city);
      System.out.println(emp.address.pincode);
      System.out.println(emp.contact.contact1);
      System.out.println(emp.contact.contact2);
      System.out.println(emp.contact.email_Id);
      System.out.println(emp.contact.outlook_Id);

	}

}
