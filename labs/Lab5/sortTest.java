//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 5

//7.19
import java.util.Scanner;

public class sortTest {
    public static void main(String[] args) {
    	//Create Scanner
        Scanner input = new Scanner(System.in);
        //Prompt the user for a list
        System.out.print("Enter list: ");
        //set SIZE equal the next inputed number
        final int SIZE = input.nextInt();
        //declare how large the list is with the SIZE var
        int[] list = new int[SIZE];
        //cycle through the spots of the array created
        for (int i = 0; i < SIZE; i++) {
        	//add numbers inputed it the array
            list[i] = input.nextInt();
        }
        //Call the isSorted method and return a boolean value
        boolean verdict = isSorted(list);
        //Print result based on return value
        if (verdict == true) {
        	System.out.print("The list is already sorted\n");
        }
        else{
        	System.out.print("The list is not sorted\n");
        }
    }

    public static boolean isSorted(int[] list) {
    	//cycle through the array of nums
        for (int i = 0; i < list.length - 1; i++) {
        	//if a preceding number is ever greater then return false
            if (list[i] > list[i + 1]) return false;
        }
        return true;
    }
}