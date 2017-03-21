//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.19.17
//lab 7

//10.5

public class DisplayPrimeFactors {
    public static void main(String[] args) {
        int number = promptInteger();
        StackOfIntegers primeFactors = getFactors(number);
        printFactors(primeFactors);
    }

    private static void printFactors(StackOfIntegers primeFactors) {
        System.out.print(primeFactors.pop());
        while (primeFactors.getSize() > 0) {
            System.out.printf(", %d", primeFactors.pop());
        }
    }

    public static int promptInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive Integer: ");
        return scanner.nextInt();
    }

    public static StackOfIntegers getFactors(int number) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        while(number > 1){
            int i = 2;
            while (number % i != 0) i++;
            stackOfIntegers.push(i);
            number /= i;
        }
        return stackOfIntegers;
    }
}