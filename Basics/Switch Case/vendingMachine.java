import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Vending Machine ===");
        System.out.println("Available items:");
        System.out.println("1. Water - $1.00");
        System.out.println("2. Soda - $1.50");
        System.out.println("3. Chips - $2.00");
        System.out.println("4. Chocolate - $2.50");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        double price = 0.0;
        String item = "";

        switch (choice) {
            case 1:
                price = 1.00;
                item = "Water";
                break;

            case 2:
                price = 1.50;
                item = "Soda";
                break;

            case 3:
                price = 2.00;
                item = "Chips";
                break;

            case 4:
                price = 2.50;
                item = "Chocolate";
                break;

            case 5:
                System.out.println("Thank you for using the vending machine!");
                scanner.close();
                return;

            default:
                System.out.println("Invalid choice! Please select 1-5.");
                scanner.close();
                return;
        }

        System.out.println("You selected: " + item);
        System.out.println("Price: $" + price);
        System.out.print("Enter amount to pay: $");
        double payment = scanner.nextDouble();

        if (payment >= price) {
            double change = payment - price;
            System.out.println("Payment successful!");
            System.out.println("Dispensing: " + item);
            if (change > 0) {
                System.out.println("Change: $" + String.format("%.2f", change));
            }
        } else {
            System.out.println("Insufficient payment! Transaction cancelled.");
            System.out.println("Returning: $" + payment);
        }

        scanner.close();
    }
}
