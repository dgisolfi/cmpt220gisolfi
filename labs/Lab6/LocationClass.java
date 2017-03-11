//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.5.17
//lab 6
import java.util.Scanner;
//9.13
public class LocationClass {
    public static void main(String[] args) {
        final int ROWS = 0, COLUMNS = 1;
        int[] arraySize = promptArraySize();
        double[][] array = prompt2DDoubleArray(arraySize[ROWS], arraySize[COLUMNS]);
        Location location = Location.locateLargest(array);
        System.out.println(location.toString());
    }

    private static int[] promptArraySize() {
        int[] size = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        for (int i = 0; i < 2; i++) {
            size[i] = scanner.nextInt();
        }
        return size;
    }

    private static double[][] prompt2DDoubleArray(int rows, int columns) {
        double[][] m = new double[rows][columns];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                m[r][c] = scanner.nextDouble();
            }
        }
        return m;
    }

    private static class Location {
        public final int row;
        public final int column;
        final double maxValue;

        Location(int row, int column, double maxValue) {
            this.row = row;
            this.column = column;
            this.maxValue = maxValue;
        }

        static Location locateLargest(double[][] a) {
            Location location = new Location(0, 0, a[0][0]);
            for (int r = 0; r < a.length; r++) {
                for (int c = 0; c < a[r].length; c++) {
                    if (a[r][c] > location.maxValue)
                        location = new Location(r, c, a[r][c]);
                }
            }
            return location;
        }

        @Override
        public String toString() {
            String formattedMaxValue;
            if (maxValue % 1.0 != 0)
                formattedMaxValue = String.format("%s", maxValue);
            else
                formattedMaxValue = String.format("%.0f", maxValue);
            return String.format("The location of the largest element is %s at (%d, %d)",
                    formattedMaxValue, row, column);
        }
    }
}