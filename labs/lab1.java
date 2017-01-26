//CMPT 220
//Author: Daniel Gisolfi
//Date: 12.22.17
//lab 1

//1.4 
public class ExpTable {
	public static void main(String[] args) {
		int a = 1;
		System.out.println("a  a^2   a^3");
		
		while (a < 5) {
		int b = a * a;
		int c = a * a * a;

		System.out.println(a + "   " + b + "    " + c);
		a = a + 1;
		}
	}
}


//2.1
import java.util.Scanner;

public class TempConvert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user for input
		
		System.out.print("Enter a celsius degree: ");
		int celsius = input.nextInt();
		double fahenheit = ((9.0/5.0) * celsius + 32); // Find fahrenheit
		
		System.out.println(celsius + " Celsius is " + fahenheit + " Fahenheit");

	}

}

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

//2.9
import java.util.Scanner;
 
public class VelocityCalc {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        //Prompt user for v0, v1, and t
        System.out.print("Enter v0, v1, and t: ");
         
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
         
        //calculate average acceleration and display answer
        double avgAcceleration = (v1 - v0) / t;
        System.out.println("The average acceleration is: " + avgAcceleration);
         
 
    }
 
}
