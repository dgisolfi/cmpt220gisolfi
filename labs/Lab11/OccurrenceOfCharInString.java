//CMPT 220
//Author: Daniel Gisolfi
//Date: 5.7.17
//Lab 11

//18.15

public class OccurrenceOfCharInString {
    private static int count = 0;

    public static void main(String[] args) {
        String string = promptUserForString();
        char ch = promptUserForCharacter();
        System.out.println("Number of occurrences: " + count(string, ch));
    }

    private static char promptUserForCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        return scanner.nextLine().charAt(0);
    }

    private static int count(String str, char a) {
        return count(str, a, str.length() - 1);
    }

    private static int count(String str, char a, int high) {
        if (high < 0) return count;
        if (a == str.charAt(high)) {
            count++;
        }
        return count(str, a, high - 1);
    }

    private static String promptUserForString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
}