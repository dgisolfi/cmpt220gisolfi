//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 5

//7.11
import java.util.Scanner;

public class computeDeviation {
    public static void main(String[] args) {
    	//declare the size of the array
        final int SIZE = 10;
        //declare array with size as constraint
        double[] array = new double[SIZE];
        //create Scanner
        Scanner input = new Scanner(System.in);
        //Prompt the user for ten numbers
        System.out.print("Enter ten numbers: ");
        //cycle through the 10 spots in the array
        for (int i = 0; i < SIZE; i++) {
        	//Add inputed numbers to array
            array[i] = input.nextDouble();
        }
        //call the mean method and pass in the array, print the return statement
        System.out.printf("The mean is %.2f%n", mean(array));
        //call the deviation method and pass in the array, print the return statement
        System.out.printf("The standard deviation is %.5f%n", deviation(array));
    }

    // Compute the deviation of double values
    public static double deviation(double[] x) {
        double mean = mean(x);
        double sum = 0;
        for (double v : x) {
            sum += Math.pow(v - mean, 2);
        }
        return Math.sqrt(sum / (x.length - 1));
    }

    // Compute the mean of an array of double values
    public static double mean(double[] x) {
        double sum = 0;
        for (double v : x) {
        	//add array together
            sum += v;
        }
        //divide sum by how many numbers are present
        return sum / x.length;
    }
}