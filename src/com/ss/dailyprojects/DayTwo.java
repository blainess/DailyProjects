package com.ss.dailyprojects;
import com.ss.dailyprojects.Rectangle;
import com.ss.dailyprojects.Circle;
public class DayTwo {
	public static void run(String[] args) {
		System.out.println("Exercise: Add command line args");
		System.out.print("Arguments: ");
		for (String arg : args) {
			System.out.print(arg + " ");
		}
		System.out.println();
		addCommandLineArguments(args);
		System.out.println();
		
		System.out.println("Exercise: find max in 2D array");
		findMaxIn2DArray();
		System.out.println();
		
		System.out.println("Exercise: Shapes implementing interface");
		runShapesExercise();
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
	
	public static void runShapesExercise() {
		Rectangle r = new Rectangle(10, 100);
		
		double area = r.calculateArea();
		System.out.println("The area of the rectangle is: " + area);
		r.display(); // print the word "Rectangle"
		System.out.println();
		
		Circle c = new Circle(23);
		area = c.calculateArea();
		System.out.println("The area of the circle is: " + area);
		c.display();
		System.out.println();
		
		Triangle t = new Triangle(9, 9, 9);
		area = t.calculateArea();
		System.out.print("The area of the triangle is: ");
		System.out.println(area);
		t.display();
		System.out.println();
	}
}