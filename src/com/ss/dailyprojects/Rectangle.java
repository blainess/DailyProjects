package com.ss.dailyprojects;

public class Rectangle {
	public int length, width;
	
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void display() {
		System.out.println("Rectangle");
	}
	
	public double calculateArea() {
		return this.length * this.width;
	}
}
