/**********************************************
Workshop # 2 
Course: JAC444SAB - Summer
Date: Friday, May 30, 2019
**********************************************/

public class Test {
    public static void main(String[] args){    
        System.out.println("\n");

        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("Triangle: (" + t1.getP1().getX() + ", " + t1.getP1().getY() +"), " + "(" +  t1.getP2().getX() + ", " + t1.getP2().getY() +"), " + "(" + t1.getP3().getX() + ", " + t1.getP3().getY() + ")");
        System.out.println("The area is: " + t1.getArea());
        System.out.println("The perimeter is: " + t1.getPerimeter());
        System.out.println("The triangle contains the point: " + t1.contains(3, 3));
        System.out.println("The triangle contains a triangle: " + t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.print("The triangle overlaps another triangle: " + t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));

        System.out.println("\n");

        Triangle2D t2 = new Triangle2D(new MyPoint(0, 0), new MyPoint(0, 2), new MyPoint(2, 0));
        System.out.println("Triangle: (" + t2.getP1().getX() + ", " + t2.getP1().getY() +"), " + "(" +  t2.getP2().getX() + ", " + t2.getP2().getY() +"), " + "(" + t2.getP3().getX() + ", " + t2.getP3().getY() + ")");
        System.out.println("The area is: " + t2.getArea());
        System.out.println("The perimeter is: " + t2.getPerimeter());
        System.out.println("The triangle contains the point: " + t2.contains(1, 1));
        System.out.println("The triangle contains a triangle: " + t2.contains(new Triangle2D(new MyPoint(4, 5), new MyPoint(10.5, 3.2), new MyPoint(-0.5, -10.5))));
        System.out.print("The triangle overlaps another triangle: " + t2.overlaps(new Triangle2D(new MyPoint(1, 1.7), new MyPoint(-1, 1.7), new MyPoint(0, -3))));

        System.out.println("\n");
    }
}
