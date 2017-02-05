//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.31.17
//lab 3

//5.16

import java.util.Scanner;

public class integrFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter an integer number: ");
	    int num = input.nextInt();

	    for (int i = 2; i <= num;) {

	        if (num % i == 0) {
	            System.out.print(i + " ");
	            num /= i;
	        } else {
	            i++;
	        }
	    }
	}
}