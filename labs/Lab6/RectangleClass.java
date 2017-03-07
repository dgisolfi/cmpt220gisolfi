//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.5.17
//lab 6

//9.1

public class RectangleClass {
    public static void main(String[] args) {
    	
        Rectangle rectangle1 = new Rectangle(40, 4);
        Rectangle rectangle2 = new Rectangle(35.9, 3.5);

        printHeader("rectangle1");
        printRectangleData(rectangle1);

        printHeader("rectangle2");
        printRectangleData(rectangle2);
    }

    private static void printHeader(String title) {
        System.out.println(title);
        System.out.println("------------");
    }

    private static void printRectangleData(Rectangle rectangle) {
        System.out.println("Width:    " + rectangle.getWidth());
        System.out.println("Height:   " + rectangle.getHeight());
        System.out.println("Area:     " + rectangle.getArea());
        System.out.println("Perimeter " + rectangle.getPerimeter());
        System.out.println();
    }

    private static class Rectangle {
        private double width;
        private double height;

        public Rectangle() {
            width = 1;
            height = 1;
        }

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return width + width + height + height;
        }
    }
}
