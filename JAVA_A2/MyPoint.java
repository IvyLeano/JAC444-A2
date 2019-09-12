/**********************************************
Workshop # 2 
Course: JAC444SAB - Summer
Date: Friday, May 30, 2019
**********************************************/

import java.lang.Math;

public class MyPoint {
	private double m_x;
	private double m_y;

	// no-arg constructor, creates a point 0,0
	MyPoint() {
		m_x = 0;
		m_y = 0;
	}

	// constructor that constructs a point with specified coordinates
	MyPoint(double x, double y) {
		m_x = x;
		m_y = y;
	}

	// getter methods
	double getX() {
		return m_x;
	}

	double getY() {
		return m_y;
	}

	// distance method, returns distance from the current objects point to the
	// object parameters point
	// uses the distance formula from:
	// https://www.wikihow.com/Find-the-Distance-Between-Two-Points
	double distance(MyPoint mypoint) {
		return distance(mypoint.m_x, mypoint.m_y);
	}

	double distance(double xVal, double yVal) {
		double x = (getX() - xVal) * (getX() - xVal);
		double y = (getY() - yVal) * (getY() - yVal);
		double distance = Math.sqrt(x + y);

		return distance;
	}
}
