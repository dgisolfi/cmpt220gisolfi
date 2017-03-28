//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.26.17
//lab 8

//11.17

import java.util.ArrayList;
import java.util.Scanner;

public class AlgebraPerfectSquare {
    public static void main(String[] args) {
    	//declare m as promptInteger method
        int m = promptInteger();
        //declare n as promptInteger method
        int n = findN(m);
        //display result
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }

    private static int findN(int number) {
    	//Create a array for facotrs
        ArrayList<Integer> factors = getFactors(number);
        ArrayList<Integer> oddCountFactors = getOddCountFactors(factors);
        return product(oddCountFactors);
    }

    private static int product(ArrayList<Integer> oddFactors) {
        int n = 1;
        //multiply each factor
        for (Integer oddFactor : oddFactors) {
            n *= oddFactor;
        }
        return n;
    }

    private static ArrayList<Integer> getOddCountFactors(ArrayList<Integer> factors) {
        ArrayList<Integer> oddFactors = new ArrayList<>();
        for (Integer factor : factors) {
            int count = 0;
            for (Integer integer : factors) {
                if (integer.equals(factor)) count++;
            }
            if (count % 2 == 1 && !oddFactors.contains(factor)) oddFactors.add(factor);
        }
        return oddFactors;
    }

    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        while(number > 1){
            int i = 2;
            while (number % i != 0) i++;
            factors.add(i);
            number /= i;
        }
        return factors;
    }

    public static int promptInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        return scanner.nextInt();
    }
}