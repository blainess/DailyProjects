package com.ss.dailyprojects;

public class DayTwo {
	public static void run(String[] args) {
		addCommandLineArguments(args);
		findMaxIn2DArray();
	}
	
	public static void addCommandLineArguments(String[] args) {
		int sum = 0;
		for (String arg : args) {
			sum = Integer.parseInt(arg) + sum;
		}
		System.out.println("Sum: " + sum);
	}
	
	public static void findMaxIn2DArray() {
		int[][] matrix = {
			{1, 7, 2}, 
			{2, 9, 3}, 
			{5, 14, 7}
		};
		int max_num = 0;
		int max_row = 0;
		int max_col = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] > max_num) {
					max_num = matrix[row][col];
					max_row = row;
					max_col = col;
				}
			}
		}
		
		System.out.println("Max number: " + max_num);
		System.out.println("Row: " + (max_row + 1));
		System.out.println("Col: " + (max_col + 1));
	}
}