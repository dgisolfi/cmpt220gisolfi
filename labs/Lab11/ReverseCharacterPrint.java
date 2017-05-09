//CMPT 220
//Author: Daniel Gisolfi
//Date: 5.7.17
//Lab 11

//18.9

public class ReverseCharacterPrint {
    public static void main(String[] args) {
        String string = promptUserForString();
        reverseDisplay(string);
    }

    private static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    private static void reverseDisplay(String value, int index) {
        if (index == 0) {
            System.out.print(value.charAt(0));
        } else {
            System.out.print(value.charAt(index));
            reverseDisplay(value, index - 1);
        }
    }

    private static String promptUserForString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
}