//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.5.17
//lab 6
import java.util.GregorianCalendar; //JA
//9.5

public class GregorianCalendarClass {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println("Current");
        printDate(gregorianCalendar);

        System.out.println("1234567898765L");
        gregorianCalendar.setTimeInMillis(1234567898765L);
        printDate(gregorianCalendar);
    }

    private static void printDate(GregorianCalendar gregorianCalendar) {
        System.out.printf("   Year:  %s%n", gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.printf("   Month: %s%n", gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.printf("   Day:   %s%n", gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();
    }
}