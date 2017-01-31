//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.25.17
//lab 2

//3.5
import java.util.Scanner;

public class FutDates {
	public static void main(String[] args) {
		//Create Scanner	
		Scanner input = new Scanner (System.in);

		//Prompt the user to enter a day of the week 0-6
		System.out.print("Enter today's day: ");
		int day = input.nextInt();

		//Prompt the user to enter the amount of day ahead of current one
		System.out.print("Enter the number of days elapsed since today: ");
		int futDay = input.nextInt();

		//Create a variable to hold day of week and give it a placeholder
		String dayString = "Day";
		//Switch the name of week to correct one
		switch(day) {
			case 0: dayString = "Sunday"; break;
			case 1: dayString = "Monday"; break;
			case 2: dayString = "Tuesday"; break;
			case 3: dayString = "Wednesday"; break;
			case 4: dayString = "Thursday"; break;
			case 5: dayString = "Friday"; break;
			case 6: dayString = "Saturday"; break;
			default: dayString = "Invalid Day"; break;
		}

		//Create a variable to hold day of week and give it a placeholder
		String futString = "Future Day";
		futDay = day + futDay; 
		//Switch the name of week to correct one
		switch(futDay % 7) {
			case 0: futString = "Sunday"; break;
			case 1: futString = "Monday"; break;
			case 2: futString = "Tuesday"; break;
			case 3: futString = "Wednesday"; break;
			case 4: futString = "Thursday"; break;
			case 5: futString = "Friday"; break;
			case 6: futString = "Saturday"; break;
			default: futString = "Invalid Day"; break;
		}
		//Output final String
		System.out.println("Today is " + dayString + " and the future day is " + futString);
	}
}

