import java.util.Scanner;

public class loginValidation {
    public static void main(String[] args) {
        String correctUsername = "pratick";
        String correctPassword = "Iam@Super123";
        int attempt = 0;

        // declaring scanner object for taking input
        Scanner takeInput = new Scanner(System.in);

        while (attempt < 3) {
            System.out.print("Enter the username: ");
            String userName = takeInput.nextLine();

            System.out.print("Enter the password: ");
            String password = takeInput.nextLine();

            if (userName.equals(correctUsername)) {
                if (password.equals(correctPassword)) {
                    System.out.println("Login successful!");
                    takeInput.close();
                    return;
                } else {
                    System.out.println("Incorrect password. Please try again.");
                }
            } else {
                System.out.println("Username not found. Please try again.");
            }
            attempt++;
        }

        System.out.println("Too many failed attempts. Access denied.");
    }
}