package com.day3;

public class Student {
	private static int studentcount=10;
	public static int  studentId=550;
	public String studentType;
	public String studentName;
	public Student() {
		studentcount=studentcount+1;
		studentId=studentcount;
	}
	public Student(char sType,String fname,String lname) {
		super();
		studentName=sType+fname+lname;
	}
	public void displayDetails() {
		studentId +=1;
		studentcount+=1;
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(studentType);
		System.out.println(studentcount);
		System.out.println();
	}
	public static void getStudentCount() {
		
		System.out.println(studentcount);
	}
	public static void main(String[] args) {
		Student so=new Student('D',"Bony","Thomas");
		so.displayDetails();
		Student so1=new Student('J',"Bon","Thom");
		so1.displayDetails();
	}
}
