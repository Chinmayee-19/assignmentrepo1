package com.day7;

public class Hostelite extends Student{
	String hostelName;
	int roomNumber;
	public Hostelite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hostelite(int studentId, char studentType, String studentName, double feesPerMonth) {
		super(studentId, studentType, studentName, feesPerMonth);
		// TODO Auto-generated constructor stub
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public void displayStudentDetails() {
		// TODO Auto-generated method stub
		super.displayStudentDetails();
		System.out.println("Hostel Name: "+hostelName+" Room Number: "+roomNumber);
	}
	
	
}
