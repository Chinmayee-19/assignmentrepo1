package com.day2;
//Assignment 7
public class PassByVal {
	public static void main(String[] args) {
		int sid=25;
		PassByVal val=new PassByVal();
		System.out.println(sid);
		val.pTheValueMethod(sid);
		System.out.println("The sId are "+sid);
	}
	public void pTheValueMethod(int sid) {
		// TODO Auto-generated method stub
		
	}
	public void pTheValueMehtod(int sid) {
		sid=10;
		System.out.println("The sId are "+sid);
	}
}
