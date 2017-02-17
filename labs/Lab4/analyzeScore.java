//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.12.17
//lab 4

//7.4
import java.util.Scanner;

public class analyzeScore {
	public static void main(String[] args) {
		//Create Scanner
        Scanner input = new Scanner(System.in);
        //declare the max number of scores
        final int MAX_SCORES = 100;
        //create an array with the size of the max number of scores
        int[] scores = new int[MAX_SCORES];
        int sum = 0;
        double average;
        int num;
        int aboveAverage = 0;
        int underAverage = 0;

        //Prompt the user to enter scores
        System.out.print("Enter the scores ");
        //add the scores to the array as long as they 
        //are less than the MAX_SCORES
        for (num = 0; num < MAX_SCORES; num++) {
        	//store the next inputed int in the score var
            int score = input.nextInt();
            //if the inputed score is not larger than 0 break the loop 
            if (score < 0){
            	break;
            } 
            //add score to array
            scores[num] = score;
            sum += score;
        }

        //Cacl the average of scores
        average = sum / num + 0.0; // JA: This has to be forced to be a non-integer calculation
        //as long as i is less the num count up
        for (int i = 0; i < num; i++) {
        	//if the scores are greater then the average add to aboveAverage
            if (scores[i] >= average) {
            	aboveAverage++;
            //else add to underAverage
            } else {
            	underAverage++;
            }
        }

        //output results of scores entered
        System.out.println(aboveAverage + " scores are above or equal to the average.");
        System.out.println(underAverage + " scores are below the average.");
    }
}

