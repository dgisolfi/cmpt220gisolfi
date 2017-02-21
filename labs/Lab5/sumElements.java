//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 5

//8.1
import java.util.Scanner;

public class sumElements {
    public static void main(String[] args) {
    	//declare an array then call getMatrix method
        double[][] matrix = getMatrix(3, 4);
        //cycle through spots of the array
        for (int i = 0; i < matrix[0].length; i++) {
        	//print out the resulta of each column
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }
    }

    public static double[][] getMatrix(int rows, int columns){
    	//create Scanner
        Scanner input = new Scanner(System.in);
        //declare matrix as a double array
        double[][] matrix = new double[rows][columns];
        //Promopt user for a 3-4 matrix
        System.out.println("Enter a 3-by-4 matrix row by row:");
        //Cycle through the 3 rows
        for (int r = 0; r < rows; r++) {
        	//Cycle through the 4 columns until 
            for (int c = 0; c < columns; c++) {
            	//get integers for matrix
                matrix[r][c] = input.nextDouble();
            }
        }
        //return finished matrix
        return matrix;
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (double[] aM : m) {
        	//add the numbrs together for the columns
            sum += aM[columnIndex];
        }
        return sum;
    }
}