//CMPT 220
//Author: Daniel Gisolfi
//Date: 4.18.17
//lab 10

//13.5

public class EnableGeometricObjectComparable {

    private static PE_13_05_Circle circle1 = new PE_13_05_Circle(Math.random() * 10);
    private static PE_13_05_Circle circle2 = new PE_13_05_Circle(Math.random() * 10);

    private static PE_13_05_Rectangle rectangle1 = new PE_13_05_Rectangle(Math.random() * 10, Math.random() * 10);
    private static PE_13_05_Rectangle rectangle2 = new PE_13_05_Rectangle(Math.random() * 10, Math.random() * 10);

    public static void main(String[] args) {
        System.out.printf("Area of circle1 = %.3f%n", circle1.getArea());
        System.out.printf("Area of circle2 = %.3f%n", circle2.getArea());
        System.out.printf("Area of rectangle1 = %.3f%n", rectangle1.getArea());
        System.out.printf("Area of rectangle2 = %.3f%n", rectangle2.getArea());
        System.out.println();
        System.out.println((circle1 == GeometricObject.Max(circle1, circle2) ?
                "circle1" : "circle2") + " is the larger circle");
        System.out.println((rectangle1 == GeometricObject.Max(rectangle1, rectangle2) ?
                "rectangle1" : "rectangle2") + " is is the larger rectangle");
    }
}

abstract class GeometricObject implements Comparable<GeometricObject>{

    public abstract double getArea();

    static GeometricObject Max(GeometricObject o1,
                                        GeometricObject o2)
            throws NullPointerException{
        if (o1 == null || o2 == null) {
            throw new NullPointerException();
        }
        return o1.compareTo(o2) >= 0 ? o1 : o2;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}

class Circle extends GeometricObject{
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends GeometricObject{
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}