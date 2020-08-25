package com.hefshine.prime;

public class Item {

	int Iid;
	String Iname;
	String IEdate;

	

	public int getIid() {
		return Iid;
	}
	public void setIid(int iid) {
		Iid = iid;
	}
	public String getIname() {
		return Iname;
	}
	
	public void setIname(String iname) {
		Iname = iname;
	}
	public String getIEdate() {
		return IEdate;
	}
	public void setIEdate(String iEdate) {
		IEdate = iEdate;
	}
	public String toString() {
		return "Item [Iid=" + Iid + ", Iname=" + Iname + ", IEdate=" + IEdate
				+ "]";
	}
	
	}
	

