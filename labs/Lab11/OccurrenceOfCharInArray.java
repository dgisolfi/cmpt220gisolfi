//CMPT 220
//Author: Daniel Gisolfi
//Date: 5.7.17
//Lab 11

//18.17
import java.util.Scanner;

public class OccurrenceOfCharInArray {
    public static void main(String[] args) {
        char[] chars = promptUserForCharArray();
        char ch = promptUserForCharacter();
        System.out.println("The count is: " + count(chars, ch));
    }

    private static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    private static int count(char[] chars, char ch, int high) {
        int count = chars[high] == ch ? 1 : 0;
        if (high == 0) return count;
        return count + count(chars, ch, high - 1);
    }

    private static char[] promptUserForCharArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter chars in one line:");
        return scanner.nextLine().toCharArray();
    }

    private static char promptUserForCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        return scanner.nextLine().charAt(0);
    }
}