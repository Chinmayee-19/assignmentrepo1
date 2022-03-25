package com.day7;

public class DayScholar extends Student{
	String residentialAddress;


	public DayScholar(int studentId, char studentType, String studentName, double feesPerMonth) {
		super(studentId, studentType, studentName, feesPerMonth);
		// TODO Auto-generated constructor stub
	}

	public DayScholar() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public void displayStudentDetails() {
		// TODO Auto-generated method stub
		super.displayStudentDetails();
		System.out.println("Residential Address: "+residentialAddress);
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
}
