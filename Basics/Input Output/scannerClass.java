import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        // taking string input from user
        System.out.print("Enter your name: ");
        String myName = takeInput.nextLine();
        System.out.printf("Good morning %s\n", myName);

        // taking integer input from user
        System.out.print("Enter any 5 digits number: ");
        int myValue = takeInput.nextInt();
        System.out.printf("Value = %d\n", myValue);

        // taking character input from user
        System.out.print("Enter the first initial of your surname: ");
        char firstInitialSurname = takeInput.next().charAt(0);
        System.out.printf("First initial of your surname is %c\n",
                firstInitialSurname);

        // taking float input from user
        System.out.print("Enter the value of log 2: ");
        float log2 = takeInput.nextFloat();
        System.out.printf("You entered the value of log 2 = %.6f\n", log2);
        if (Math.abs(log2 - 0.301020) < 0.000001) {
            System.out.println("The log2 value is correct.");
        } else {
            System.out.println("The log2 value is incorrect.");
        }

        // taking double input from user
        System.out.print("Enter the value of PI: ");
        double piValue = takeInput.nextDouble();
        System.out.printf("You enterd the value of PI = %.6f\n", piValue);
        if (piValue == 3.141592) {
            System.out.println("The pi value is correct.");
        } else {
            System.out.println("The pi value is incorrect.");
        }

        takeInput.close();
    }
}