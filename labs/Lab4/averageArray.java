//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 4

//7.8

import java.util.Scanner;

public class averageArray {
    public static void main(String[] args) {
    	//Create Scanner
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        //Prompt the user for ten numbers
        System.out.print("Enter ten numbers: ");
        //count up to 10 as ints are entered
        for (int i = 0; i < 10; i++) {
        	//
            numbers[i] = input.nextDouble();
        }
        //call the average methods, then print the average
        System.out.println("The average is " + average(numbers));
    }

    public static int average(int[] array){
        //declare as a double
        int sum = 0;
        for (int numArray : array) {
            sum += numArray;
        }
        //calculate and return average
        return sum / array.length;
    }

    public static double average(double[] array){
        //declare as a double
        double sum = 0;
        for (double numArray : array) {
            sum += numArray;
        }
        //calculate and return average
        return sum / array.length;
    }
}