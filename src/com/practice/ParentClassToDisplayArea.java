package com.practice;

public class ParentClassToDisplayArea {
	
	/**
	 * 
	 * @param length
	 * @param width
	 * @return Area of Square
	 */

	public double  displayArea(double length, double width) {
		return length*width;
		
		}
	/**
	 * 
	 * @param radius
	 * @return Area of Circle
	 */

	public double displayArea(double radius) {
		
		double pie = 3.14;
		return pie*radius*radius ;
		
	}

}
