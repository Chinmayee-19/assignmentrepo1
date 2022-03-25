package com.day2;
import java.util.*;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade=sc.nextLine();
		switch (grade) {
		case "A":
			System.out.println("Marks are between 80 to 100");
			break;
		case "B":
			System.out.println("Marks are between 73 to 79");
			break;
		case "C":
			System.out.println("Marks are between 65 to 72");
			break;
		case "D":
			System.out.println("Marks are between 55 to 64");
			break;
		case "E":
			System.out.println("Marks are less than 55");
			break;
		default:
			System.out.println("Grade Doesnot exist");
			break;
		}
	}
}
