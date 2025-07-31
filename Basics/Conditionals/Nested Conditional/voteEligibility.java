import java.util.Scanner;

public class voteEligibility {
    public static void main(String[] args) {
        // defining scanner object for taking input
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = takeInput.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            if (age >= 16) {
                System.out.println("You can pre-register to vote.");
            } else {
                System.out.println("You are too young for voting.");
            }
        }

        takeInput.close();
    }
}