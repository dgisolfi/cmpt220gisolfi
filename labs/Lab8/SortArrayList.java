//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.26.17
//lab 8

//11.11

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
    	//Create a new integer array list
        ArrayList<Integer> list = new ArrayList<>();
        //Create Scanner
        Scanner scanner = new Scanner(System.in);
        //Prompt user for five numbers
        System.out.println("Enter 5 numbers: ");
        //Cycle through the 5 spots of the array and add entered integers
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }
        //Sort the numbers
        sort(list);
        //Print the sorted numbers
        System.out.println(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}