package com.cjc.springbootcrudapp.app.model;

public class Student
{
	private int rollno;
	private String name;
	private String address;
	private long mobileno;
	private String gender;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobno() {
		return mobileno;
	}
	public void setMobno(long mobno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "StudentController [rollno=" + rollno + ", name=" + name + ", address=" + address + ", mobileno=" + mobileno
				+ ", gender=" + gender + "]";
	}

}
