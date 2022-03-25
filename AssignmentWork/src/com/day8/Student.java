package com.day8;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, char studentType, String studentName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
	}
	public static void main(String[] args) {
		System.out.println("Hi");
	}
}
