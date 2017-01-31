//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.25.17
//lab 2

//4.9

import java.util.Scanner;

public class unicodeChar {
	public static void main(String[] args) {
		//Create Scanner	
		Scanner input = new Scanner (System.in);

		//Prompt the user to enter a character
		System.out.print("Enter a character: ");
		char charInput = (char)input.next().charAt(0);
		
		int uniVal = (int)charInput;
		//Output Unicode
		System.out.println("The Unicode for the character" + charInput + " is " + uniVal);
	}
}

