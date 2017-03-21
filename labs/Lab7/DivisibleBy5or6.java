//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.19.17
//lab 7

//10.21

public class DivisibleBy5or6 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger(Long.toString(Long.MAX_VALUE)).add(BigInteger.ONE);
        System.out.println(Long.MAX_VALUE + "\n");
        printNumbersDivisibleBy5or6(bigInteger, 10);
    }

    private static void printNumbersDivisibleBy5or6(BigInteger start, int quantity) {
        int count = 0;
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        while (count < quantity) {
            if (start.mod(five).equals(BigInteger.ZERO)
                    || start.mod(six).equals(BigInteger.ZERO)) {
                System.out.println(start.toString());
                count++;
            }
            start = start.add(BigInteger.ONE);
        }
    }
}