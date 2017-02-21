//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 5

//7.10

import java.util.Arrays;

public class arrayElements {
    public static void main(String[] args) {
    	//create a new array that contains double type
        double[] array = new double[10];
        //loop through the contents of the array
        for (int i = 0; i < array.length; i++) {
        	//place a random double in each spot of the array
            array[i] = ((int)(Math.random() * 100)) / 10.0;
        }
        //convert array to a string then print it
        System.out.println(Arrays.toString(array));
        //call the method and print its return val
        System.out.println("The smallest index is: " + indexOfSmallestElement(array));
    }

    public static int indexOfSmallestElement(double[] array) {
        int index = 0;
        //loop through the contents of the array
        for (int i = 1; i < array.length; i++) {
        	//set i equal to the lowest number
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}