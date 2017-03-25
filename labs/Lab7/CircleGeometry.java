//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.19.17
//lab 7

//10.11

public class CircleGeometry {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Circle2D c1:");
        System.out.println("   Area:      " + c1.getArea());
        System.out.println("   Perimeter: " + c1.getPerimeter());
        System.out.println("   c1.contains(3, 3):\n      "
                + c1.contains(3, 3)); //T
        System.out.println("   c1.contains(new Circle2D(4, 5, 10.5)):\n      "
                + c1.contains(new Circle2D(4, 5, 10.5))); //F
        System.out.println("   c1.overlaps(new Circle2D(3, 5, 2.3))):\n      "
                + c1.overlaps(new Circle2D(3, 5, 2.3))); //F
    }

    private static class Circle2D {
        private final double x;
        private final double y;
        private final double radius;

        Circle2D() {
            this(0, 0, 1);
        }

        Circle2D(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        double getX() {
            return x;
        }

        double getY() {
            return y;
        }

        double getRadius() {
            return radius;
        }

        double getArea() {
            return Math.PI * radius * radius;
        }

        double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        boolean contains(double x, double y) {
            return distance(x, y) < radius;
        }

        boolean contains(Circle2D circle) {
            return distance(circle.x, circle.y) <= radius - circle.radius; // JA
        }

        boolean overlaps(Circle2D circle) {
            return distance(circle.x, circle.y) <= radius + circle.radius;
  //                  && !contains(circle); // JA: Not needed
        }

        double distance(double x, double y) {
            return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        }
    }
}