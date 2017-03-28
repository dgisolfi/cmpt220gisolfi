//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.23.17
//Java Password Manager

import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class PassManager {

	public static void main(String[] args) {
		menu();
		
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
			create();
		} else if (cmd == 2) {
			view();
		} else {
			System.out.println("not a valid input");
		}
	}

	public class Account{
		public String accountName;
		public String username;
		public String password;
	}
	public static void create() {
		Scanner input = new Scanner(System.in);
		System.out.println("Create new login:");
		System.out.print("What is the name of this account? ");
		String accountName = input.next();
		System.out.print("What is the username ? ");
		String username = input.next();
		System.out.print("What is the password? ");
		String pw = input.next();
	}

	public static void view() {
		System.out.print("run View");
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

Youve Never meant anything to me or anyone else for more than one night