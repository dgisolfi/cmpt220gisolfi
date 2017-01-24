//CMPT 220
//Author: Daniel Gisolfi
//Date: 12.22.17
//lab 1

//1.4
// What unit is used to measure CPU speed?
// Hertz

//2.1
//Errors: static was missing, string was uncapitilized
public class Test {
    public static void main(String[] args) { 
    	double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;
        
        System.out.println("j is " + j + " and k is " + k);
    }
}

//2.5
//Errors: k was not defined
public class Test {
	public static void main(String[] args) {
		int k = 2;
		int i = k + 2;
		System.out.println(i);
	}
}

//2.6
//Errors: i, j, k are were not correctly defined  
public class Test {
	public static void main(String[] args) {
		int i = 2;
		int j = 2;
		int k = 2;

		System.out.println(i + " " + j + " " + k);
	}
}

//2.9

public class Convert {
	public static void main(String[] args) {
		double miles = 100;
		final double KILOMETERS_PER_MILE = 1.609;
		double kilometers = miles * KILOMETERS_PER_MILE;
		
		System.out.println(kilometers);
	}
}

//output = 160.9

//not sure if the following were the problems supposed to be completed, quickly did a few

//2.1
import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user for input
		
		System.out.print("Enter a celsius degree: ");
		int celsius = input.nextInt();
		int fahenheit = (9/5) * celsius + 32; // Find fahrenheit
		
		System.out.println(celsius + " celsius is " + fahenheit + "fahenheit");

	}

}

//2.5

import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user for input
		
		System.out.print("Enter a subtotal: ");
		int subtotal = input.nextInt();

		System.out.print("Enter a gratuity: ");
		int gratuity = input.nextInt();


		int subtotal = subtotal/gratuity ; // Find 
		
		System.out.println(subtotal);

	}

}

