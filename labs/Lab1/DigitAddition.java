//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.22.17
//lab 1

//2.6
import java.util.Scanner;

public class DigitAddition {
	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);

		//Prompt a user for a integer between 0 and 1000
		System.out.println("Enter a number between 0 and 1000: ");
		int num = input.nextInt();

		//Add Digits of integer
		int ones = (num % 10);
		int tens = ((num / 10 ) % 10);
		int hundreds = ((num / 100 ) % 10);

		int total = (ones + tens + hundreds);

		System.out.println("The sum of the digits is " + total);

	}
}