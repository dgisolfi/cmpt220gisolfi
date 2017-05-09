//CMPT 220
//Author: Daniel Gisolfi
//Date: 5.7.17
//Lab 11

//18.11
import java.util.Scanner;

public class DigitSumRecursion {
    public static void main(String[] args) {
        int number = promptIntegerValue();
        System.out.println("The sum of digits: " + sumDigits(number));
    }

    private static int sumDigits(long n) {
        return sumDigits(n, 0);
    }

    private static int sumDigits(long n, int result) {
        if (n <= 0) {
            return result;
        } else {
            return sumDigits(n / 10, result + (int) (n % 10));
        }
    }

    private static int promptIntegerValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return 0;
    }
}