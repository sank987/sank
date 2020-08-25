package com.hefshine.advancedloop;
class student
{
	private int id;
	private String name;
	
public	student(int i,String s)
	{
		this.id=i;
		this.name=s;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	
}

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student(10,"sanket");
System.out.println(s1);


	}

}
