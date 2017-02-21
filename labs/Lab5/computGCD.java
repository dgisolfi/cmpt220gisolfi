//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 5

//7.14
import java.util.Scanner;

public class computGCD {
    public static void main(String[] args) {
    	//create Scanner
        Scanner input = new Scanner(System.in);
        //Declare size of array
        final int SIZE = 5;
        //create array with SIZE as constraint
        int[] numbers = new int[SIZE];
        //Promt the user for 5 numbers
        System.out.print("Enter 5 numbers: ");
        //cycle through the 5 spots of the array
        for (int i = 0; i < SIZE; i++) {
        	//Add inpouted numbers to array
            numbers[i] = input.nextInt();
        }
        //Call the gcdmethod and print result
        System.out.println("The GCD is: " + gcd(numbers));
    }

    public static int min(int[] array) {
   		//declare the min as the 0 spot of the array
        int min = array[0];
        //cycle through the spots of the array
        for (int i = 1; i < array.length; i++) {
        	//if the number in a spot of the array is less than the min then 
        	//set the that as the new min
            if (array[i] < min) min = array[i];
        }
        //return the minninum
        return min;
    }

    public static int gcd(int... numbers) {
    	//call the min method to find the minninum 
        int min = min(numbers);
        //try every number lower than min
        for (int i = min; i > 0; i--) {
            boolean gcd = true;
            for (int number : numbers) {
            	//check if these conditions are true througout numbers
                gcd = gcd && (number % i == 0);
            }
            //if the gcd is more than 1 return it
            if (gcd) return i;
        }
        //else return 1
        return 1;
    }
}