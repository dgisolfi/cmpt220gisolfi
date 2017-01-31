//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.30.17
//lab 2

//4.20

import java.util.Scanner;

public class StringCount {
	public static void main(String[] args) {
		//Create Scanner	
		Scanner input = new Scanner (System.in);

		//Prompt the user to enter a String
		System.out.println("Enter a String: ");
		String str = input.next();

		//Count the length of the String
		int strCount = str.length();

		//Grab the first character in string
		String strFirst = str.substring(0,1);

		//Display strCount and strFirst
		System.out.println("The length of the string is " + strCount + " and the first Character is " + strFirst);
	}
}
	