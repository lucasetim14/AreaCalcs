package com.etim.areacalc;

public class AreaCircle {
	static double radius = 3;
	static double area;
	static double PI = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getEntry(radius, PI);
		getEntry(area);
	}

	public static void getEntry(double radius, double PI) {
		// TODO Auto-generated method stub
		area = PI * (radius * radius);
		
	}

	public static void getEntry(double y) {
		System.out.println(area);
		
	}
}
