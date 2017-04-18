//CMPT 220
//Author: Daniel Gisolfi
//Date: 4.18.17
//lab 10

//13.11

public class TheOctagonClass {
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = (Octagon) octagon1.clone();

        System.out.println("octagon1");
        System.out.println("   Perimeter = " + octagon1.getPerimeter());
        System.out.println("   Area =      " + octagon1.getArea());
        System.out.println("octagon2");
        System.out.println("   Perimeter = " + octagon2.getPerimeter());
        System.out.println("   Area =      " + octagon2.getArea());
        System.out.println();
        System.out.println("octagon1.compareTo(octagon2) = " + octagon1.compareTo(octagon2));
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

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
    double side = 1;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if (this.equals(o)) {
            return 0;
        } else if (this.side > o.side) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Octagon && this.side == ((Octagon)o).side;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}