//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 5

//8.5
import java.util.Scanner;

public class addMatrices {
    public static void main(String[] args) {
    	//Declare the first matrix and run getMatrix Method
        double[][] matrix1 = getMatrix(3, 3);
        //Decalre the second matrix and run getMatrix Method
        double[][] matrix2 = getMatrix(3, 3);
        //call addMatrix method and put result into sum matrix
        double[][] sum = addMatrix(matrix1, matrix2);
        System.out.println("The matrices are added as follows");
        printResult(matrix1, matrix2, sum);
    }

    public static double[][] getMatrix(int rows, int columns) {
        //create a matrix m with limited rows and colums
        double[][] m = new double[rows ][columns];
        //create Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a " + rows + "-by-" + columns + " matrix row by row:");
        //Cycle through the 3 rows
        for (int r = 0; r < rows; r++) {
        	//Cycle through the 3 columns
            for (int c = 0; c < columns; c++) {
            	//get integers for matrix
                m[r][c] = input.nextDouble();
            }
        }
        return m;
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
    	//check if the matix is complete 
        if (a.length == 0) return null;
        //check if both matrix are 3 by 3
        if (a.length != b.length) return null;
        //Cycle through the matrix
        for (int i = 0; i < a.length; i++) {
            if (a[0].length != b[i].length) return null;
        }
        double[][] sum = new double[a.length][a[0].length];
         //Cycle through the matrix1
        for (int i = 0; i < a.length; i++) {
        	 //Cycle through the matrix2
            for (int j = 0; j < a[0].length; j++) {
            	//add individual spots of matrix 1 by 1
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static void printResult(double[][] addend1, double[][] addend2, double[][] sum){
        for (int i = 0; i < addend1.length; i++) {
            for (int j = 0; j < addend1[0].length; j++) {
                System.out.printf("%4.1f ", addend1[i][j]);
            }
            System.out.print(i == addend1.length / 2 ? " +  " : "    ");
            for (int j = 0; j < addend2[0].length; j++) {
                System.out.printf("%4.1f ", addend2[i][j]);
            }
            System.out.print(i == addend1.length / 2 ? " =  " : "    ");
            for (int j = 0; j < sum[0].length; j++) {
                System.out.printf("%4.1f ", sum[i][j]);
            }
            System.out.println();
        }
    }
}