//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.30.17
//lab 2

//4.13

import java.util.Scanner;

public class VowelConsLetter {
	public static void main(String[] args) {
		//Create Scanner	
		Scanner input = new Scanner (System.in);

		//Prompt the user to enter a Letter then change it to lowercase
		System.out.print("Enter a Letter: ");
		String letter = input.next();
		letter.toLowerCase();

		//Search Vowels for inputed letter
		// JA: You are missing the upper case vowels. "y" is a consonant.
		if (letter.equals("a")|| letter.equals("e")|| letter.equals("i")
			||letter.equals("o")||letter.equals("u")||letter.equals("y")) { 
			//If True output that the input is a Vowel
			System.out.println(letter + " is a vowel");
		} else { 
			// JA: You also need to make sure that the character is a letter
			//Else output that the inout is a consanat
			System.out.println(letter + " is a consonant");
		}
	} 
}
	

