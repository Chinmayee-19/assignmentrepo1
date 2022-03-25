package com.day2;
//assignment 4
public class Student {
	private int studentid=10;
	private char studentType='F';
	public void Student() {
		System.out.println(studentid+" "+studentType);
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentType=" + studentType + "]";
	}
	
}
