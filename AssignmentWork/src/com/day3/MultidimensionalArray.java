package com.day3;

public class MultidimensionalArray {
	public static void main(String[] args) {
		String[][] arr= {new String[]{"Tony","JAVA","C","C++"},
				new String[]{"Thomas","JAVA","Unix"},
				new String[]{"Dinil","Linux","Oracle"},
				new String[]{"Delvin","RDBMS","C#","Oracle"}};
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();}
	}			
}
