//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.1.17
//lab 3

//6.3

import java.util.Scanner;

public class ReverseNumber {

   public static void main(String[] args) {
   		//Create Scanner
       Scanner input = new Scanner(System.in);

       //Prompt the user to enter an integer 
       System.out.print("Enter the number to be reversed : ");
       int num = input.nextInt();

       //Run reverse method and display result
       int reverseResult = reverse(num);
       System.out.println("The reversed number is " + reverseResult);

       //Run isPalindrome and print result
       boolean palindromeResult = isPalindrome(num, reverseResult);
       System.out.println("The integer entered is a Palindrone: " + palindromeResult);
   }

   public static int reverse(int n) {
       int result = 0;
       //Remainder 
       int rem;
       //loop while n is greater than 0
       while (n > 0) {
       		//pull out the digit farthest right
        	rem = n % 10;
        	//pull out the next digit farthest right
        	n = n / 10;
        	//add digits in oppisite order
           	result = result * 10 + rem;
       }
       //return the reversed number n
       return result;
   }

   public static boolean isPalindrome(int num, int result) {
        boolean palindromeResult = false;
        //check if the original number entered is equal to the reveresed number
        if (num == result) {
            //if they are equal return true as it is a Palindrome
            palindromeResult = true;
            return true;
        } else {
            //Else it is not a Palindrom return false
            return false;
        }
    }
}