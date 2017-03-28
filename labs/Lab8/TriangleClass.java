//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.26.17
//lab 8

//11.1

import utility.Triangle;
import java.util.Scanner;

public class TriangleClass {
    public static void main(String[] args) {
        double[] sides = promptDoubleValues(3);
        String color = promptStringValue();
        boolean filled = promptBooleanValue();
        //Declare a new Triangle
        Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
        triangle.setColor(color);
        triangle.setFilled(filled);
        //Calculate area and print it
        System.out.println("Area:      " + triangle.getArea());
        //Calculate Perimiter and print it
        System.out.println("Perimeter: " + triangle.getPerimeter());
        //Get the color and print it
        System.out.println("Color:     " + triangle.getColor());
        System.out.println("Filled:    " + triangle.isFilled());
    }

    private static boolean promptBooleanValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter [T]rue' for filled, or [F]alse for unfilled: ");
        return scanner.nextLine().toUpperCase().charAt(0) == 'T';
    }

    private static String promptStringValue() {
    	//Creat Scanner
        Scanner scanner = new Scanner(System.in);
        //Prompt User to enter a color
        System.out.print("Enter a color: ");
        //Return the next input
        return scanner.nextLine();
    }

    private static double[] promptDoubleValues(int size) {
    	//Create a values array
        double[] values = new double[size];
        //Create Scanner
        final Scanner SCANNER = new Scanner(System.in);
        //Prompt the user for size
        System.out.print("Enter " + size + " sides: ");
        for (int i = 0; i < size; i++) {
            values[i] = SCANNER.nextDouble();
        }
        return values;
    }
}