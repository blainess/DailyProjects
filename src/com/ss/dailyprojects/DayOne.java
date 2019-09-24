package com.ss.dailyprojects;

public class DayOne {
	static int initialDotsPerRow = 9;

	public static void printFirstPattern() {
		// j = number of rows
		for (int j = 1; j <= 4; j++) {
			// k = number of stars
			for (int k = 1; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = 1; j <= initialDotsPerRow; j++) {
			System.out.print(".");
		}
		System.out.println();
	}
	
	public static void printSecondPattern() {
		// j = number of rows
		for (int j = 1; j <= 4; j++) {
			// k number of stars
			for (int k = 4; k >= j; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = 1; j <= initialDotsPerRow + 1; j++) {
			System.out.print(".");
		}
		System.out.println();
	}

	public static void printThirdPattern() {
		// j = number of rows
		int spacesNum = 5;
		int starsNum = 1;
		for (int j = 1; j <= 4; j++) {
			// l = spaces
			for (int l = 1; l <= spacesNum; l++) {
				System.out.print(" ");
			}
			spacesNum--;
			// k = stars
			for (int k = 1; k <= starsNum; k++) {
				System.out.print("*");
			}
			starsNum = starsNum + 2;
			System.out.println();
		}
		for (int j = 1; j <= initialDotsPerRow + 2; j++) {
			System.out.print(".");
		}
		System.out.println();
	}

	public static void printFourthPattern() {
		// j = number of rows
		int spacesNum = 2;
		int starsNum = 7;
		for (int j = 1; j <= 4; j++) {
			// l = spaces
			for (int l = 1; l <= spacesNum; l++) {
				System.out.print(" ");
			}
			spacesNum++;
			// k = stars
			for (int k = 1; k <= starsNum; k++) {
				System.out.print("*");
			}
			starsNum = starsNum - 2;
			System.out.println();
		}
		for (int j = 1; j <= initialDotsPerRow + 3; j++) {
			System.out.print(".");
		}
		System.out.println();
	}
	
	public static void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println(i + ")");
			switch (i) {
				case 1:
					printFirstPattern();
					break;
				case 2:
					printSecondPattern();
					break;
				case 3:
					printThirdPattern();
					break;
				case 4:
					printFourthPattern();
					break;
			}
		}
	}
}
