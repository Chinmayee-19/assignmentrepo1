package com.day6;

public class StudentMain {
public static void main(String[] args) {
	Student s=new Student(101, "Hostler", "K", "Chinmayee", 0);
	s.setResidentialStatus("Hostler");
	if(s.getResidentialStatus().equalsIgnoreCase("day scholar")) {
		s.calculateFees(100000);
	}
	else {
		s.calculateFees(100000,35000);
	}
	
}
}
