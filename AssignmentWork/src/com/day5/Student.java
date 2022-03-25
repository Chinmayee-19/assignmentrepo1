package com.day5;

public class Student {
	int studentId;
    String studentName;
	String residentialStatus;
	long feesPerMonth;
	
	public Student(int studentId, String studentName, String residentialStatus, long feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.residentialStatus = residentialStatus;
		this.feesPerMonth = feesPerMonth;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public long getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", residentialStatus="
				+ residentialStatus + ", feesPerMonth=" + feesPerMonth + "]";
	}
	public void display() {
		System.out.println(studentId+" "+studentName+" "+residentialStatus+" "+feesPerMonth);
	}
}
