import java.util.*;
import static java.lang.Math.sqrt;

class Point {
    double a;
    double b;

    public Point(double x, double y) {
        this.a = x;
        this.b = y;
    }

    static void distance(Point n1, Point n2) {
        double c = ((n1.b - n1.a) * (n1.b - n1.a)) + ((n2.b - n2.a) * (n2.b - n2.a));

        System.out.println(sqrt(c) + " is distance between two points");
    }

}

class Straight {
    double a;
    double b;

    public Straight(double x, double y) {
        this.a = x;
        this.b = y;
    }

    static void slope(Straight n1, Straight n2) {
        double m = ((n2.b - n2.a) / (n1.b - n1.a));
        System.out.println("Slope of two point is " + m);
        System.out.println("y - " + n1.b + " = " + m + " (x- " + n1.a + ")");
        System.out.println("y - " + n2.b + " = " + m + " (x- " + n2.a + ")");
    }
}

public class geometry {
    public static void main(String args[]) {
        Point n1 = new Point(2.0, 6.0);
        Point n2 = new Point(3.0, 5.0);
        Point.distance(n1, n2);
        Straight n3 = new Straight(2.0, 6.0);
        Straight n4 = new Straight(3.0, 5.0);
        Straight.slope(n3, n4);
    }
}