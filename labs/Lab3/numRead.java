//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.31.17
//lab 3

//5.1

import java.util.Scanner;

public class numRead {
	public static void main(String[] args) {
       //Create a Scanner
	   Scanner input = new Scanner(System.in);
	   
	   // Read data
	   System.out.print(
		 "Enter an integer (the input ends if it is 0): ");
	   int data = input.nextInt();
	   
	   //Read data until the input is 0
	   float sum = 0;
	   int positive = 0;
	   int negative = 0;
	   while (data != 0) {
	   		//Add the data
	   		sum += data;
		    //Create two counters 
		    
		    //If the data entered is positive add 1 to the positive counter
		    if (data > 0) {
		    	positive++;
		    //If the data entered is negative add 1 to the negative counter
		    } else if (data < 0) {
		    	negative++;
		    }

		   // Read the next data
		   //System.out.print("Enter an integer (the input ends if it it 0): ");
		   data = input.nextInt();
	   }

	   //Calc Average
	   double average = sum/(negative + positive);
	   System.out.println("The number of positives is " + positive);
	   System.out.println("The number of negatives is " + negative);
	   System.out.println("The sum is " + sum);
	   System.out.println("The average is " + average);
		   
	}
}