package com.ss.dailyprojects;

public class Triangle implements Shape {
	public int sideA, sideB, sideC;
	
	Triangle(int sideA, int sideB, int sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public double calculateArea() {
		double s = (this.sideA + this.sideB + this.sideC) / 2.0d;
		double x = (s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
		double area = Math.sqrt(x);
		return area;
	}
	
	public void display() {
		System.out.println("Triangle");
	}
}
