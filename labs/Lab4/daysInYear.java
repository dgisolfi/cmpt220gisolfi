//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 4

//6.16
import java.util.Scanner;

public class daysInYear {
	public static void main(String[] args) {
        //Create Scanner
    	Scanner input = new Scanner(System.in);
	    //Prompt user for a start year
	    System.out.print("Enter a start year: ");
	    int strYear = input.nextInt();
	    //Prompt user for a end year
	    System.out.print("Enter a end year: ");
	    int endYear = input.nextInt();
	    //Find differnece between years 
	    int year =  endYear - strYear; // JA: You were supposed to print every year from 200 to 2020
	    //run numberOfDaysInAYear method and calculate amount 
	    //of years, then return answer and print
	    System.out.println("The amount of days in "+ year + " years is " 
	    	+ numberOfDaysInAYear(year));
    }

    public static int numberOfDaysInAYear(int year) {
    	//the difference in years multiplied by the amount of days per year
    	return 365 * year; // JA: You are missing the calculation for a leap year.
    }
}