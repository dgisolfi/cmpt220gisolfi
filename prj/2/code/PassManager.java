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
		menu();
	}	

	public static void menu() {
		int userChoice;
        Scanner input = new Scanner(System.in);
		userChoice = menuChoice();

		if (userChoice == 1) {
			write();
		} else if (userChoice == 2) {
			read();
		} else if (userChoice == 3) {
			System.exit(0);
		} else {
			System.out.println("not a valid input");
		}
	}
		

	public static int menuChoice() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------");
        System.out.println("1 - Add a new Password");
        System.out.println("2 - View a password");
        System.out.println("3 - Quit");

        selection = input.nextInt();
        System.out.println();
        return selection;    
    }

	// public class Account{
	// 	public String accountName;
	// 	public String username;
	// 	public String password;
	// }
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
		//Create new JSON object
		JSONObject accountObj = new JSONObject();
		//add each element of the account to the JSON file
		accountObj.put("Account Name", accountName);
		accountObj.put("Username", username);
		accountObj.put("Password", pw);
 
		try {
			
			// Writing to a file
			//Create new file with name Password
			File file=new File("Password.json");
			//Physically create it
			file.createNewFile();
			//Open file writer
			FileWriter fileWriter = new FileWriter(file);
			System.out.println("Writing JSON object to file");
			//System.out.println("-----------------------");
			//System.out.print(accountObj);
 			
 			//Write to file then close it.
			fileWriter.write(accountObj.toJSONString());
			fileWriter.flush();
			fileWriter.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
 		
 		menu();
	}
	
	public static void read() {
		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("Password.json"));

			JSONObject jsonObject = (JSONObject) obj;
		 	//Print Account Name
			String accountName = (String) jsonObject.get("Account Name");
			System.out.println("Name of Account: "+ accountName);
		 	//Print UserName
		 	String userName = (String) jsonObject.get("Username");
			System.out.println("Username: "+ userName);
			//Print Password
			String password = (String) jsonObject.get("Password");
			System.out.println("Password: "+ password);
			System.out.println();
		 
		  	} catch (FileNotFoundException e) {
		   	e.printStackTrace();
		 	} catch (IOException e) {
		   	e.printStackTrace();
		  	} catch (ParseException e) {
		   	e.printStackTrace();
		}
		menu();
	}

	public static void generatePw() {
		//Random rand = new Random();
		//int  n = rand.nextInt(50) + 1;

		Random r = new Random();
		//String strongPW = " "
		String alphabet = "abcdefghijklmnopqrstuvwxyz123456789";
		for (int i = 0; i < 20; i++) {
			alphabet.charAt(r.nextInt(alphabet.length()));
		} // prints 50 random characters from alphabet
	}
}

