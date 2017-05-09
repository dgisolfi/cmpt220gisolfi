//CMPT 220
//Author: Daniel Gisolfi
//Date: 5.7.17
//Lab 11

//18.7

import java.util.Scanner;


public class FibonacciSeries {

    private static int callCount = 0;

    public static void main(String args[]) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println("Fibonacci number at index " + index + " is " + fib(index));

        // Display the method call count
        System.out.println("Call count = " + callCount);
    }

    private static long fib(long index) {
        callCount++;
        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else  // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
    }
}