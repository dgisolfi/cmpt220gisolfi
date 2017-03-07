//CMPT 220
//Author: Daniel Gisolfi
//Date: 2.5.17
//lab 6

//9.7

public class AccountClass {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(4.5);
        Account account = new Account(1122, 20000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Account-" + account.getId());
        System.out.printf("   Balance:          $%,.2f%n", account.getBalance());
        System.out.printf("   Monthly interest: $%,.2f%n", account.getMonthlyInterest());
        System.out.printf("   Date Created:     %s%n", account.getDateCreated().toString());
    }

    private static class Account {
        private static double annualInterestRate = 0;
        private final Date dateCreated = new Date();
        private int id = 0;
        private double balance = 0;

        Account() {
        }

        Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        static double getAnnualInterestRate() {
            return annualInterestRate;
        }

        static void setAnnualInterestRate(double annualInterestRate) {
            Account.annualInterestRate = annualInterestRate;
        }

        int getId() {
            return id;
        }

        void setId(int id) {
            this.id = id;
        }

        double getBalance() {
            return balance;
        }

        void setBalance(double balance) {
            this.balance = balance;
        }

        Date getDateCreated() {
            return dateCreated;
        }

        double getMonthlyInterest() {
            return balance * (getMonthlyInterestRate() / 100.0);
        }

        double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }

        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            }
        }

        void deposit(double amount) {
            balance += amount;
        }
    }
}
