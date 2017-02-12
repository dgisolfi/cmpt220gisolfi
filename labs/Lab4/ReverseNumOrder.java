//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.12.17
//lab 4

//7.2

import java.util.Scanner;

public class ReverseNumOrder {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Create an array to store the 10 numbers to
        int[] num = new int[10];
        //Propmt the user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        //add 1 to i each time a number is added
        for (int i = 0; i < num.length; i++) {
            //add the intgeres to the array
            num[i] = input.nextInt();
        }
        //call the function reversArray and pass the num array to it
        reverseArray(num);
        //call the function printArray and pass the num array to it
        printArray(num);
    }

    public static void reverseArray(int[] array){

        for (int i = 0; i < array.length / 2; i++) {
            //create a temp var to store a vairable while 
            //it is moved in the order of the array
            int temp = array[i];
            //subtract the integers 1 at a time 
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int anArray : array) {
            //Print each int back with spaces
            System.out.print(anArray + " ");
        }
    }
}