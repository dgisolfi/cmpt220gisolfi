//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.26.17
//lab 8

//11.3

import utility.Account;
import utility.CheckingAccount;
import utility.SavingsAccount;

public class SubclassesOfAccount {
    public static void main(String[] args) {
    	//Create new array of accounts
        Account[] accounts = new Account[3];

        //Create a new account
        accounts[0] = new Account(10001, 101.0);
        //Create a different account of a checkings type
        accounts[1] = new CheckingAccount(20002, 202.0, 50.0);
        //Create a different account of a Savings type
        accounts[2] = new SavingsAccount(30003, 303.0);

        for (Account account: accounts) {
        	//Print a all accounts
            System.out.println(account);
        }
    }
}