public class Test {
    public static void main(String[] args){
        //testing different values
        Triangle2D t1 = new Triangle2D(new MyPoint(0, 0), new MyPoint(2, 3), new MyPoint(4,0));
        System.out.println("The area is: " + t1.getArea());
        System.out.println("The perimeter is: " + t1.getPerimeter());
        
        System.out.println("The triangle contains the point: " + t1.contains(10, 1));
        System.out.println("The triangle contains the Triangle: " + t1.contains(new Triangle2D(new MyPoint(1, 1), new MyPoint(3, 1), new MyPoint(2, 2))));

        /*
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("The area is: " + t1.getArea());
        System.out.println("The perimeter is: " + t1.getPerimeter());

        System.out.println("The triangle contains the point: " + t1.contains(3, 3));
        System.out.println("The triangle contains the point: " + t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        //System.out.print(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), MyPoint(2, 6.5))));

        Triangle2D t2 = new Triangle2D(new MyPoint(0, 0), new MyPoint(0, 2), new MyPoint(2, 0));
        System.out.println("The area is: " + t2.getArea());
        System.out.println("The perimeter is: " + t2.getPerimeter());
        System.out.println("The triangle contains the point: " + t2.contains(1, 1));
        System.out.println("The triangle contains the point: " + t2.contains(new Triangle2D(new MyPoint(4, 5), new MyPoint(10.5, 3.2), new MyPoint(-0.5, -10.5))));
       // System.out.print(t2.overlaps(new Triangle2D(new MyPoint(1, 1.7), new MyPoints(-1, 1.7), new MyPoints(0, -3))));

       //Note: Students can also design the program to take these points as input from the user as well.
       */
    }
}