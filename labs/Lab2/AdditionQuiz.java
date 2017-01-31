//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.25.17
//lab 2

//3.2
import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10); // generate number 1
		int number2 = (int)(Math.random() * 10); // generate number 2
		int number3 = (int)(Math.random() * 10); // generate number 3

		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Ask the user and answer to a addidtion question
		System.out.print("What is " + number1 + " + " + number2 +
		 " + " + number3 +  "? ");

		int answer = input.nextInt();

		//Tell user if the answer inputed was correct or not
		if (number1 + number2 + number3 == answer) {
			System.out.println("You are Correct!");
		} else{
			System.out.println("Your answer is wrong!");

		//Print Correct answer
		System.out.println(
				number1 + " + " + number2 + " + " + number3 + " = "  
				+ (number1+number2+number3));

		}
		
	}

}
