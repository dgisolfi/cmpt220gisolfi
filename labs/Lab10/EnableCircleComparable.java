//CMPT 220
//Author: Daniel Gisolfi
//Date: 4.18.17
//lab 10

//13.9

public class EnableCircleComparable {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(5);
        Circle circle4 = new Circle(6);

        System.out.println("circle1.compareTo(circle2) = " + circle1.compareTo(circle2));
        System.out.println("circle2.compareTo(circle3) = " + circle2.compareTo(circle3));
        System.out.println("circle3.compareTo(circle4) = " + circle3.compareTo(circle4));
        System.out.println("circle4.compareTo(circle1) = " + circle4.compareTo(circle1));
    }
}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    @Override
    public int compareTo(Circle o) {
        if (this.equals(o)) {
            return 0;
        } else if (this.radius > o.radius) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Circle && this.radius == ((Circle) o).radius;
    }
}