package com.day2;
//Assignment 6
public class UserType {
	String name;
	UserType(String paraVal){
		name=paraVal;
	}
	UserType(){
		this("Student");
	}
	public static void main(String[] args) {
		UserType user1=new UserType("Faculty");
		UserType user2= new UserType();
		System.out.println(user1.name);
		System.out.println(user2.name);
	}

}
