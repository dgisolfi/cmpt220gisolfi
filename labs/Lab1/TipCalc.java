//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.22.17
//lab 1

//2.5
import java.util.Scanner;

public class TipCalc {
	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter a subtotal and Gratuity: ");
		double subtotal = input.nextInt();
		double gratuityRate = input.nextInt();

		//calculate Gratuity 
		double gratuity =(gratuityRate/10);
		//add gratuity to subtotal to create total cost
		double total = gratuity + subtotal;
		
		//Output answer
		System.out.println("The Gratuity is $" + gratuity + " and total is $" + total);

	}

}