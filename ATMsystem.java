import java.util.Scanner;

public class ATMsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000;
        int pin = 1234;
        int attempts = 0;

        while (true) {
            System.out.println("Welcome to the ATM system");
            System.out.print("Please enter your PIN: ");
            int userPin = input.nextInt();
            attempts++;

            if (userPin == pin) {
                while (true) {
                    System.out.println("");
                    System.out.println("Please select an option:");
                    System.out.println("1. Check balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Exit");
                    int choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Your current balance is: " + balance);
                    } else if (choice == 2) {
                        System.out.print("Enter the amount to withdraw: ");
                        double amount = input.nextDouble();

                        if (amount > balance) {
                            System.out.println("Insufficient funds");
                        } else {
                            balance -= amount;
                            System.out.println("Transaction successful");
                            System.out.println("Your new balance is: " + balance);
                        }
                    } else if (choice == 3) {
                        System.out.print("Enter the amount to deposit: ");
                        double amount = input.nextDouble();
                        balance += amount;
                        System.out.println("Transaction successful");
                        System.out.println("Your new balance is: " + balance);
                    } else if (choice == 4) {
                        System.out.println("Thank you for using the ATM system");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid option");
                    }
                }
            } else {
                System.out.println("Incorrect PIN");
            }

            if (attempts == 3) {
                System.out.println("Maximum attempts reached");
                System.exit(0);
            }
        }
    }
}
