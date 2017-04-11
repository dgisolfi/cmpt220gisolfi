//CMPT 220
//Author: Daniel Gisolfi
//Date: 4.10.17
//lab 9

//12.4

import utility.IllegalTriangleException;
import utility.Triangle_12_5;

public class IllegalTriangleException {
    public static void main(String[] args) throws IllegalTriangleException {
        // This triangle will throw an exception.
        Triangle_12_5 triangle = new Triangle_12_5(1, 2, 4);
    }
}