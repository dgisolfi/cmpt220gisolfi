//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.23.17
//Java Password Manager

import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PassManager {
	public static void main(String[] args) {
		login();
		JSONParser parser = new JSONParser();
 
	        try {
	            Object jsonObject = parser.parse(new FileReader("Accounts.json"));
	 
	            JSONObject obj = (JSONObject) jsonObject;
	 
	            JSONArray pwlist = (JSONArray) obj.get("Accounts");
	            String pwString = pwlvist.toJSONString();
	           
	            String secureString = decrypt(pwString);
 				//System.out.println(secureString);
	            System.out.println("file decrypted");


                try (FileWriter file = new FileWriter("Accounts.json")) {
                file.write(secureString);
                file.flush();

                } catch (IOException e) {
                    e.printStackTrace();
                }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			System.exit(0);
		//Else tell the user that there entry is invalid
	}

	public static void login() {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Prompt User for password
		System.out.print("Enter Master Password \n>>> ");
		//Create variable to hold user password
		String pass;
		//user password is the next line entered
		pass = input.next();
		
		if (pass.equals("dng")) {
			//Return to menu
			System.out.println("Login successful");
			//recall menu method 
			menu();
		} else {
			//notify the user they entered the wrong password
			System.out.println("Wrong Password");
			//run the login method again
			login();
		}
	}

	public static void menu() {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Declare variable for future selection
		int userChoice;
		//call menuChoice method
		userChoice = menuChoice();
		
		//if the user chose number 1, call write method
		if (userChoice == 1) {
			//call write method
			write();
		//Else if the user chose number 2, call write method
		} else if (userChoice == 2) {
			//call read method
			read();
		//Else if the user chose number 3, call generatepw method
		} else if (userChoice == 3) {
			//call generatePw method
			String generatedpw = generatePw();
			System.out.println("Newly generated password:");
			System.out.println(generatedpw);
			System.out.println();
			menu();
		//Else if the user chose number 4, quit program
		} else if (userChoice == 4) {
			//quit program
			quit();
		}	
	}
		

	public static int menuChoice() {
		//declare variable for future selection
        int selection;
        //Create Scanner
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------");
        System.out.println("1 - Add a new Password");
        System.out.println("2 - View passwords");
        System.out.println("3 - Generate a password");
        System.out.println("4 - Quit");

    	//Get next integer with scanner
        selection = input.nextInt();
        //Print a buffer line
        System.out.println();
        //return decision to main method
        return selection;    
    }

	public static void write() {

        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Prompt user for a new login
        System.out.println("Create new login:");
        //Prompt user for name of the account
        System.out.print("What is the name of this account? ");
        String accountName = input.next();
        //Prompt user for username
        System.out.print("What is the username? ");
        String username = input.next();
        //Prompt User for password
        System.out.print("What is the password? ");
        String pw = input.next();

        JSONObject newPW = new JSONObject();
        newPW.put("Account Name", accountName);
        newPW.put("Username", username);
        newPW.put("Password", pw);

        File f = new File("Accounts.json");
        
        if(f.exists()) { 
            JSONParser parser = new JSONParser();

            try {
                Object jsonObject = parser.parse(new FileReader("Accounts.json"));
     
                JSONObject obj = (JSONObject) jsonObject;
     
                JSONArray pwlist = (JSONArray) obj.get("Accounts");
                
                pwlist.add(newPW);
                obj.put("Accounts", pwlist);

                try (FileWriter file = new FileWriter("Accounts.json")) {
                file.write(obj.toJSONString());
                file.flush();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(pwlist);
            } catch (Exception e) {
            e.printStackTrace();
            }
        } else {
            JSONObject obj = new JSONObject();

            JSONArray pwlist = new JSONArray();
            pwlist.add(newPW);
            obj.put("Accounts", pwlist);

            try (FileWriter file = new FileWriter("Accounts.json")) {
            file.write(obj.toJSONString());
            file.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(pwlist);
        }
 		menu();
	}

	public static void read() {
		JSONParser parser = new JSONParser();
 
        try {
            Object jsonObject = parser.parse(new FileReader("Accounts.json"));
 
            JSONObject  obj = (JSONObject) jsonObject;
 
            JSONArray pwlist = (JSONArray) obj.get("Accounts");
 
            System.out.println(pwlist);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
		menu();
	}

	public static String encrypt(String key) {
        //declare variable to hold final string
        String result = "";
        //find the length of inputed object "key"
        int l = key.length();
        //create new char to add to result
        char ch;
        //cycle through the code for the length of key
        for(int i = 0; i < l; i++){
        	//record char at every i
            ch = key.charAt(i);
            //move unicode 10 forward
            ch += 10;
            //add char back to result to encrypt 
            result += ch;
        }
        //return encrypted string
        return result;
    }

    public static String decrypt(String key) {
    	//declare variable to hold final string
        String result = "";
        //find the length of inputed object "key"
        int l = key.length();
        //create new char to add to result
        char ch;
        //cycle through the code for the length of key
        for(int i = 0; i < l; i++){
        	//record char at every i
            ch = key.charAt(i);
            //move unicode 10 backwards
            ch -= 10;
            //add char back to result to decrypt 
            result += ch;
        }
        //return decrypted string
        return result;
    }

	public static String generatePw() {
		//declare variable to hold final password
		String pw = "";
		//declare a string that holds all possible characters for the password
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";	
		//cycle through the code 20 times
		for (int i = 0; i < 20; i++) {
			//Create a new random variable
			Random rand = new Random();
			//create n and hold a random integer in it
			int n = rand.nextInt(60) + 1;
			//use n to pick a radnom character in main alphabet string
			pw += alphabet.substring(n, n+1);
		} 
		//return final password
      	return pw;
	}

	public static void quit();{
		JSONParser parser = new JSONParser();
 
	        try {
	            Object jsonObject = parser.parse(new FileReader("Accounts.json"));
	 
	            JSONObject obj = (JSONObject) jsonObject;
	 
	            JSONArray pwlist = (JSONArray) obj.get("Accounts");
	            String pwString = pwlvist.toJSONString();
	           
	            String secureString = encrypt(pwString);
 				//System.out.println(secureString);
	            System.out.println("file encrypted");


                try (FileWriter file = new FileWriter("Accounts.json")) {
                file.write(secureString);
                file.flush();

                } catch (IOException e) {
                    e.printStackTrace();
                }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			System.exit(0);
		//Else tell the user that there entry is invalid
		} else {
			System.out.println("not a valid input");
		}
	}
}



