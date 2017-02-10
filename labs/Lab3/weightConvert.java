//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.6.17
//lab 3

//5.5

public class weightConvert {
    public static void main(String[] args) {
        System.out.println("Kilograms   Pounds   |   Pounds   Kilograms");
        for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
            System.out.printf("%-9d%9.1f   |   %-9d%9.2f%n", i, i * 2.2, j, j / 2.2);
        }
    }
} // JA: Your file was missing this }