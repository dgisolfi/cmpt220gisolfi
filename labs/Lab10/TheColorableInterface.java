//CMPT 220
//Author: Daniel Gisolfi
//Date: 4.18.17
//lab 10

//13.7

public class TheColorableInterface {
    public static void main(String[] args) {
        GeometricObject[] shapes = generateShapesArray(5);
        displayShapeInfo(shapes);
    }

    private static void displayShapeInfo(GeometricObject[] shapes) {
        for (GeometricObject shape : shapes) {
            System.out.println(shape.getClass() + "\n   Area: " + shape.getArea());
            if (shape instanceof Colorable) {
                System.out.print("   ");
                ((Colorable) shape).howToColor();
            }
        }
    }

    private static GeometricObject[] generateShapesArray(int size) {
        GeometricObject[] shapes = new GeometricObject[size];
        for (int i = 0; i <shapes.length ; i++) {
            if ((int) (Math.random() * 2) == 0) {
                shapes[i] = new Square(i + 1);
            } else {
                shapes[i] = new Circle(i + 1);
            }
        }
        return shapes;
    }
}

interface Colorable{
    void howToColor();
}

abstract class GeometricObject{
    public abstract double getArea();
}

class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}