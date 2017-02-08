//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 4

//6.9

public class lengthConvert {
    public static void main(String[] args) {
      //Create a Heading
      System.out.println("Feet    Meters    |    Meters    Feet");
        //run through each iteration from 1-10
        for (double f = 1, m = 20; f <= 10; f++, m += 5) {
          //Print outputs of both methods in chart
            System.out.printf("%4.1f    %-9.3f |    %-9.1f  %7.3f%n", 
            	f + 0.0, footToMeter(f), m + 0.0, meterToFoot(m));
        }

    }

     public static double footToMeter(double f){
        //Convert Feet to Meters
        return 0.305 * f;
    }

    public static double meterToFoot(double m){
         //Convert Meters to Feet
        return 3.279 * m;
   	}
}