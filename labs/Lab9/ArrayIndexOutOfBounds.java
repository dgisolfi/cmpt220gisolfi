//CMPT 220
//Author: Daniel Gisolfi
//Date: 4.10.17
//lab 9

//12.3

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] array = generateIntArray(100);
        int index = promptInteger();
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }

    private static int[] generateIntArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }

    public static int promptInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        return scanner.nextInt();
    }
}