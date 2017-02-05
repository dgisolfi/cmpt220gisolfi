//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.31.17
//lab 3

//6.1

public class PentagonalNumber {
	public static void main(String[] args) {
		//Print a Heading
		System.out.println("The First 100 Pentagonal Numbers: ");
		//loop until i = 100
        for (int num = 1; num <= 100; num++) {
            System.out.print(getPentagonalNumber(num));
            //if this is the 10th number break the line
            if (num % 10 == 0) {
                System.out.println();
            //Else add a space and the next Pentagonal number
            } else {
                System.out.print("\t");
            }
        }
    }
 
    public static int getPentagonalNumber(int n) {
    	//Calculate the Pentganol number
        return (3 * n * n - n) / 2;
    }
}