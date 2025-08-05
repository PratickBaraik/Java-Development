import java.util.Scanner;

public class atmMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.0;

        System.out.println("=== ATM Menu System ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Transfer Funds");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your current balance is: $" + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: $");
                double deposit = scanner.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Successfully deposited $" + deposit);
                    System.out.println("New balance: $" + balance);
                } else {
                    System.out.println("Invalid deposit amount!");
                }
                break;

            case 3:
                System.out.print("Enter amount to withdraw: $");
                double withdraw = scanner.nextDouble();
                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Successfully withdrew $" + withdraw);
                    System.out.println("New balance: $" + balance);
                } else if (withdraw > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    System.out.println("Invalid withdrawal amount!");
                }
                break;

            case 4:
                System.out.println("Transfer funds feature coming soon!");
                break;

            case 5:
                System.out.println("Thank you for using our ATM!");
                break;

            default:
                System.out.println("Invalid choice! Please select 1-5.");
        }

        scanner.close();
    }
}
