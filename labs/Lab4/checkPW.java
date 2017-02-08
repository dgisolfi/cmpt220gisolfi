//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.7.17
//lab 4

//6.18
import java.util.Scanner;

public class checkPW {
	public static void main(String[] args) {
	//Create Scanner
    Scanner input = new Scanner(System.in);
    //State Reqirements for a PW
    System.out.println("Password Constraints:\n"
    				+ "A password must have at least eight characters.\n"
					+ "A password consists of only letters and digits.\n"
					+ "A password must contain at least two digits.\n");
    //Prompt user for a password 
    System.out.println("Please Enter a Valid password");
    String pw = input.next();
    //Run ValidatePw method to Validate the entered Password
    System.out.println(("The Password " + pw + " is Valid = " + validatePw(pw)));
	}

	public static boolean validatePw (String pw) {
		//Record the length of the inputed pw
		int pwLength = pw.length();
		//Create a Variable to store the amount of digits in the pw
		int digcount = 0;
		//Test if the pw is at least 8 characters
		if (pwLength <= 7) {
			//if the pw does not contain at least 8
			return false;
		}
		//Check each Character of the pw string for digits and letters
		for (int x = 0; x < pwLength; x++) {
			//returns each character one at a time
			char ch = pw.charAt(x);
			//checks eache character in pw for a digit and leters
            if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
            	return false;
            }
            //if a digit is found, count it
            if (ch >= '0' && ch <= '9') {
            	//stores amount of digits in pw
            	digcount++;
            }
		}
		//returns wether the requirement of 2 digits is met
		return digcount >= 2;
	}
}

