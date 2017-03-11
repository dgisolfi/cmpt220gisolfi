//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.5.17
//lab 6
import java.util.Scanner; // JA
//9.11
public class LinearEquations {
    public static void main(String[] args) {
        final int A = 0, B = 1, C = 2, D = 3, E = 4, F = 5;
        double[] values = promptValues();
        LinearEquation linearEquation = new LinearEquation(
                values[A], values[B], values[C], values[D], values[E], values[F]);
        printResults(linearEquation);
    }

    private static double[] promptValues() {
        double[] values = new double[6];
        final Scanner SCANNER = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = SCANNER.nextDouble();
        }
        return values;
    }

    private static void printResults(LinearEquation linearEquation) {
        System.out.printf(linearEquation.isSolvable() ?
                        "x is %.2f and y is %.2f" : "The equation has no solution.",
                linearEquation.getX(), linearEquation.getY());
    }

    private static class LinearEquation {
        private final double a;
        private final double b;
        private final double c;
        private final double d;
        private final double e;
        private final double f;

        LinearEquation(double a, double b, double c, double d, double e, double f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

        double getA() {
            return a;
        }

        double getB() {
            return b;
        }

        double getC() {
            return c;
        }

        double getD() {
            return d;
        }

        double getE() {
            return e;
        }

        double getF() {
            return f;
        }

        boolean isSolvable() {
            return a * d - b * c != 0;
        }

        double getX() {
            return (e * d - b * f) / (a * d - b * c);
        }

        double getY() {
            return (a * f - e * c) / (a * d - b * c);
        }
    }
}
