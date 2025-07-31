import java.util.Scanner;

public class nestedConditional {
    public static void main(String[] args) {
        // defining scanner object for taking input
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = takeInput.nextInt();

        System.out.print("Enter second number: ");
        int b = takeInput.nextInt();

        System.out.print("Enter third number: ");
        int c = takeInput.nextInt();

        if(a == b && b == c) {
            System.out.println("All three numbers are equal");
        } else {
            if(a != b && b != c && a != c) {
                System.out.println("All three numbers are different");
            } else {
                System.out.println("Two numbers are equal");
            }
        }

        takeInput.close();
    }
}