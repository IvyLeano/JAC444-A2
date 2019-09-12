/**********************************************
Workshop # 2 
Course: JAC444SAB - Summer
Date: Friday, May 30, 2019
**********************************************/

import java.awt.geom.Line2D;

public class Triangle2D {
    private MyPoint m_p1;
    private MyPoint m_p2;
    private MyPoint m_p3;

    // no-arg constructor that creates default triangle: (0,0),(1,1),(2,5)
    Triangle2D() {
        setP1(0.0, 0.0);
        setP2(1.0, 1.0);
        setP3(2.0, 5.0);
    }

    // constructor that creates a triangle with specified points
    Triangle2D(MyPoint x, MyPoint y, MyPoint z) {
        setP1(x.getX(), x.getY());
        setP2(y.getX(), y.getY());
        setP3(z.getX(), z.getY());
    }

    // getter methods
    MyPoint getP1() {
        return m_p1;
    }

    MyPoint getP2() {
        return m_p2;
    }

    MyPoint getP3() {
        return m_p3;
    }

    // setter methods
    void setP1(double x, double y) {
        m_p1 = new MyPoint(x, y);
    }

    void setP2(double x, double y) {
        m_p2 = new MyPoint(x, y);
    }

    void setP3(double x, double y) {
        m_p3 = new MyPoint(x, y);
    }

    // getArea method: uses area formula from page 3 of the lab
    double getArea() {
        double s = (m_p1.distance(m_p2) + m_p2.distance(m_p3) + m_p3.distance(m_p1)) / 2;
        double area = Math.sqrt(s * ((s - m_p1.distance(m_p2)) * (s - m_p2.distance(m_p3)) * (s - m_p3.distance(m_p1))));
        return area;
    }

    // created another getArea method with parameters to reduce the code in
    // contains(double x, double y);
    double getArea(double x, double y, double z) {
        double s = (x + y + z) / 2;
        return Math.sqrt(s * ((s - x) * (s - y) * (s - z)));
    }

    // getPerimeter method
    double getPerimeter() {
        double perimeter = m_p1.distance(m_p2) + m_p2.distance(m_p3) + m_p3.distance(m_p1);
        return perimeter;
    }

    // changed parameter from (MyPoint p), since the test program specifies two
    // ints: t1.contains(3,3)
    // if the point is inside the triangle then the larger triangle can be split
    // into three, the area of all three should equal the size
    // of the larger triangle
    boolean contains(double x, double y) {
        double area1 = getArea(m_p1.distance(x, y), m_p2.distance(m_p1), m_p2.distance(x, y));
        double area2 = getArea(m_p1.distance(x, y), m_p3.distance(m_p1), m_p3.distance(x, y));
        double area3 = getArea(m_p3.distance(x, y), m_p2.distance(m_p3), m_p2.distance(x, y));

        return Math.round((area1 + area2 + area3) * 100) / 100 == Math.round(getArea() * 100) / 100;
    }

    // if all points are inside the triangle then the triangle must be nested
    boolean contains(Triangle2D t) {
        boolean a = contains(t.getP1().getX(), t.getP1().getY());
        boolean b = contains(t.getP2().getX(), t.getP2().getY());
        boolean c = contains(t.getP3().getX(), t.getP3().getY());

        return a && b && c;
    }

    // Below I am checking each side of triangle t with each side of the triangle of
    // the current object to see if they intersect
    // If any of the sides intersect then the triangles must also intersect.
    boolean overlaps(Triangle2D t) {

        boolean Aa = Line2D.linesIntersect(t.getP1().getX(), t.getP1().getY(), t.getP3().getX(), t.getP3().getY(),
                getP1().getX(), getP1().getY(), getP3().getX(), getP3().getY());
        boolean Ab = Line2D.linesIntersect(t.getP1().getX(), t.getP1().getY(), t.getP3().getX(), t.getP3().getY(),
                getP1().getX(), getP1().getY(), getP2().getX(), getP2().getY());
        boolean Ac = Line2D.linesIntersect(t.getP1().getX(), t.getP1().getY(), t.getP3().getX(), t.getP3().getY(),
                getP3().getX(), getP3().getY(), getP2().getX(), getP2().getY());

        boolean Ba = Line2D.linesIntersect(t.getP1().getX(), t.getP1().getY(), t.getP2().getX(), t.getP2().getY(),
                getP1().getX(), getP1().getY(), getP3().getX(), getP3().getY());
        boolean Bb = Line2D.linesIntersect(t.getP1().getX(), t.getP1().getY(), t.getP2().getX(), t.getP2().getY(),
                getP1().getX(), getP1().getY(), getP2().getX(), getP2().getY());
        boolean Bc = Line2D.linesIntersect(t.getP1().getX(), t.getP1().getY(), t.getP2().getX(), t.getP2().getY(),
                getP3().getX(), getP3().getY(), getP2().getX(), getP2().getY());

        boolean Ca = Line2D.linesIntersect(t.getP3().getX(), t.getP3().getY(), t.getP2().getX(), t.getP2().getY(),
                getP1().getX(), getP1().getY(), getP3().getX(), getP3().getY());
        boolean Cb = Line2D.linesIntersect(t.getP3().getX(), t.getP3().getY(), t.getP2().getX(), t.getP2().getY(),
                getP1().getX(), getP1().getY(), getP2().getX(), getP2().getY());
        boolean Cc = Line2D.linesIntersect(t.getP3().getX(), t.getP3().getY(), t.getP2().getX(), t.getP2().getY(),
                getP3().getX(), getP3().getY(), getP2().getX(), getP2().getY());

        return Aa || Ab || Ac || Ba || Bb || Bc || Ca || Cb || Cc;
    }
}
