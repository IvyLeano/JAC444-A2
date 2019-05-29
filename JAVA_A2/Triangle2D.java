import java.awt.geom.Line2D;
//import java.text.DecimalFormat;
public class Triangle2D {
    private MyPoint m_p1;
    private MyPoint m_p2;
    private MyPoint m_p3;

    Triangle2D(){
        setP1(0.0,0.0);
        setP2(1.0,1.0);
        setP3(2.0,5.0);
    }
    Triangle2D(MyPoint x, MyPoint y, MyPoint z){
        setP1(x.getX(),x.getY());
        setP2(y.getX(),y.getY());
        setP3(z.getX(),z.getY());
    }
    //getter methods
    MyPoint getP1() {
        return m_p1;
    }
    MyPoint getP2(){
        return m_p2;
    }
    MyPoint getP3(){
        return m_p3;
    }
    //setter methods
    void setP1(double x, double y){
        m_p1 = new MyPoint(x,y);
    }
    void setP2(double x, double y){
        m_p2 = new MyPoint(x,y);
    }
    void setP3(double x, double y){
        m_p3 = new MyPoint(x,y);
    }
    double getArea(){
        double a = m_p1.distance(m_p2);
        double b = m_p2.distance(m_p3);
        double c = m_p3.distance(m_p1);
        double numerator = (a + b + c) / 2;
        double area = Math.sqrt(numerator*((numerator - a) * (numerator - b) * (numerator - c)));
        return area;
    }
    double getPerimeter(){
        double a = m_p1.distance(m_p2);
        double b = m_p2.distance(m_p3);
        double c = m_p3.distance(m_p1);
        double perimeter = a + b + c;
        return perimeter;
    }
    //changed parameter from (MyPoint p) 
    boolean contains(double x, double y){
       double area1Numerator = (m_p1.distance(x, y) + m_p2.distance(m_p1) + m_p2.distance(x, y)) / 2;
       double area1 = Math.sqrt(area1Numerator*((area1Numerator - m_p1.distance(x, y)) * (area1Numerator - m_p2.distance(m_p1)) * (area1Numerator - m_p2.distance(x, y))));
      // System.out.println("\n area1 = " + area1);
       double area2Numerator = (m_p1.distance(x, y) + m_p3.distance(m_p1) + m_p3.distance(x, y)) / 2;
       double area2 = Math.sqrt(area2Numerator*((area2Numerator - m_p1.distance(x, y)) * (area2Numerator - m_p3.distance(m_p1)) * (area2Numerator - m_p3.distance(x, y))));
      // System.out.println("\n area2 = " + area2);
       double area3Numerator = (m_p3.distance(x, y) + m_p2.distance(m_p3) + m_p2.distance(x, y)) / 2;
       double area3 = Math.sqrt(area3Numerator*((area3Numerator - m_p3.distance(x, y)) * (area3Numerator - m_p2.distance(m_p3)) * (area3Numerator - m_p2.distance(x, y))));
       //System.out.println("\n area3 = " + area3);
       boolean contains = Math.round((area1 + area2 + area3) * 100) / 100 == Math.round(getArea() * 100) / 100;

       System.out.println("\n area = " + Math.round((area1 + area2 + area3) * 100) / 100 + " " + Math.round(getArea() * 100) / 100);
       return contains;
    }
    boolean contains(Triangle2D t){
        boolean a = contains(t.getP1().getX(), t.getP1().getY());
        boolean b = contains(t.getP2().getX(), t.getP2().getY());
        boolean c = contains(t.getP3().getX(), t.getP3().getY());
        boolean contains = a && b && c;
        return contains;
    }
    /*
    boolean overlaps(Triangle2D t){
        
    }*/
}

