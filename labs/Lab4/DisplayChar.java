//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 4

//6.12

public class DisplayChar {
    public static void main(String[] args) {
    	//Run printChars method, Pass 1 to ch1 and z to ch2 
    	//and pass 10 into numberPerLine
        printChars('1', 'z', 10);
        //print extra line when finished with method
        System.out.println();
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        //create a counter
        int charCount = 0;
        //convert chars to integers and loop until the 
        //declared integer n reaches the chars
        for (int n = ch1; n <= ch2; n++) {
        	//print char then a space
            System.out.print((char) n + "\t");
            //add 1 to counter after printing a char
            charCount++;
            //check if the max number of chars per line is reached
            if (charCount == numberPerLine) {
            	//if so break to a new line
                System.out.println();
                //reset counter from 10 to 0
                charCount = 0;
            }
        }
    }
}