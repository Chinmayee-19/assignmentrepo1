package com.day7;

public class StudentMain {
	public static void main(String[] args) {
		Student s=new Student();
		String st=args[0];
		if(st.equalsIgnoreCase("hostelite")) {
			Student s2=new Hostelite();
			s2.displayStudentDetails();
		}else {
			DayScholar s1=new DayScholar(101,'f',"Chandana", 1500);
			s1.setResidentialAddress("Hyderabad");
			s1.displayStudentDetails();
		}
		
	}
}
