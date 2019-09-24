package com.ss.dailyprojects;

public class Circle {
	public int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	public void display() {
		System.out.println("Circle");
	}
	
	public double calculateArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
}
