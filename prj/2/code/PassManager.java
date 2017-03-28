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
		write();
		
	}
	public static void menu() {
		//Display main menu
		String mainMenu = ("Type one of the following and click enter:\nCreate\nView\n");
		System.out.print(mainMenu);
		//Create Scanner
		Scanner input = new Scanner(System.in);
		int cmd = input.nextInt();
		System.out.println(cmd);

		if (cmd == 1) {
			write();
		} else if (cmd == 2) {
			read();
		} else {
			System.out.println("not a valid input");
		}
	}

	// public class Account{
	// 	public String accountName;
	// 	public String username;
	// 	public String password;
	// }
	public static void write() {
		Scanner input = new Scanner(System.in);

		System.out.println("Create new login:");

		System.out.print("What is the name of this account? ");
		String accountName = input.next();

		System.out.print("What is the username ? ");
		String username = input.next();

		System.out.print("What is the password? ");
		String pw = input.next();

		JSONObject accountObj = new JSONObject();
		accountObj.put("Account Name", accountName);
		accountObj.put("Username", username);
		accountObj.put("Password", pw);
 
		try {
			
			// Writing to a file
			File file=new File("Password.json");
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			System.out.println("Writing JSON object to file");
			//System.out.println("-----------------------");
			//System.out.print(accountObj);
 
			fileWriter.write(accountObj.toJSONString());
			fileWriter.flush();
			fileWriter.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
 
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
		 
		  	} catch (FileNotFoundException e) {
		   	e.printStackTrace();
		 	} catch (IOException e) {
		   	e.printStackTrace();
		  	} catch (ParseException e) {
		   	e.printStackTrace();
		}
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
