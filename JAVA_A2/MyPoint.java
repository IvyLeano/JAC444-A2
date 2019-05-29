import java.lang.Math;
//MyPoint class
public class MyPoint {
	private double m_x;
	private double m_y;

	MyPoint() {
		m_x = 0;
		m_y = 0;
	}

	MyPoint(double x, double y) {
		m_x = x;
		m_y = y;
	}

	double getX() {
		return m_x;
	}

	double getY() {
		return m_y;
	}

	double distance(MyPoint mypoint) {
		double x = (getX() - mypoint.getX()) * (getX() - mypoint.getX());
		double y = (getY() - mypoint.getY()) * (getY() - mypoint.getY());
		double distance = Math.sqrt(x + y);
		return distance;
	}

	double distance(double xVal, double yVal) {
		double x = (getX() - xVal) * (getX() - xVal);
		double y = (getY() - yVal) * (getY() - yVal);
		double distance = Math.sqrt(x + y);
		return distance;
	}
}

