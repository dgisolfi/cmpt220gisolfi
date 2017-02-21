//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 5

//8.10
public class largestRowColumn {
    public static void main(String[] args) {
    	//declare a matrix that calls the new matrix method
        int[][] matrix = newMatrix(4, 4);
        //print the matrix created
        printMatrix(matrix);
        //call the getMaxIndices method
        int[] maxIndices = getMaxIndices(matrix);
        //print result for row
        System.out.println("The largest row index: " + maxIndices[0]);
        //print result for column
        System.out.println("The largest column index: " + maxIndices[1]);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix);
            }
            System.out.println();
        }
    }

    public static int[][] newMatrix(int rows, int columns) {
    	//declare a new matrix
        int[][] matrix = new int[rows][columns];
        //cycle through rows of matrix
        for (int i = 0; i < rows; i++) {
        	//cycle through columns of matrix
            for (int j = 0; j < columns; j++) {
            	//create a random number and input it into the matrix
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        return matrix;
    }

    public static int[] getMaxIndices(int[][] matrix) {
        int colIndex = 0;
        int rowIndex = 0;
        int maxRow= 0;
        int maxCol = 0;
        //cycle through the matrix
        for (int i = 0; i < matrix.length; i++) {
            int sumRow = 0;
            int sumCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow += matrix[i][j];
                sumCol += matrix[j][i];
            }
            if (sumRow > maxRow) {
                maxRow = sumRow;
                rowIndex = i;
            }
            if (sumCol > maxCol) {
                maxCol = sumCol;
                colIndex = i;
            }
        }
        int[] indices = new int[2];
        indices[0] = rowIndex;
        indices[1] = colIndex;
        return indices;
    }
}