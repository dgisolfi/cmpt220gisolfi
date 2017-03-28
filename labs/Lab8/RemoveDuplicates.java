//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.26.17
//lab 8

//11.13
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
    	//Create a new integer array list
        ArrayList<Integer> list = new ArrayList<>();
        //Create Scanner
        Scanner scanner = new Scanner(System.in);
        //Prompt user for ten numbers
        System.out.println("Enter ten integers: ");
        //Cycle through the 10 spots of the array and add entered integers
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        //call removeDuplicate method
        removeDuplicate(list);
        //Call printList method
        printList(list);
    }

    private static void printList(ArrayList<Integer> list) {
        System.out.print("The distinct integers are");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (Integer integer : list) {
            if (!noDuplicates.contains(integer)) noDuplicates.add(integer);
        }
        list.clear();
        list.addAll(noDuplicates);
    }

}