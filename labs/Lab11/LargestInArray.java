//CMPT 220
//Author: Daniel Gisolfi
//Date: 5.7.17
//Lab 11

//18.13

public class LargestInArray {
    public static void main(String[] args) {
        int[] values = promptIntegerValues(8);
        System.out.println(getLargestValue(values));
    }

    private static int[] promptIntegerValues(int size) {
        int[] values = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter eight integers: ");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static int getLargestValue(int[] values) {
        return getLargestValue(values, values.length - 1, Integer.MIN_VALUE);
    }

    private static int getLargestValue(int[] values, int index, int max) {
        if (index < 0) return max;
        if (values[index] > max) max = values[index];
        return getLargestValue(values, index - 1, max);
    }
}