import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = takeInput.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = takeInput.nextDouble();

        System.out.printf("Sum of %.2f and %.2f is %.2f\n", firstNumber, secondNumber, (firstNumber + secondNumber));

        if(firstNumber > secondNumber) {
            System.out.printf("Difference of %.2f and %.2f is %.2f\n", firstNumber, secondNumber, (firstNumber - secondNumber));
        } else {
            System.out.printf("Difference of %.2f and %.2f is %.2f\n", firstNumber, secondNumber, (secondNumber - firstNumber));
        }

        System.out.printf("Product of %.2f and %.2f is %.2f\n", firstNumber, secondNumber,
                (firstNumber * secondNumber));

        System.out.printf("Division of %.2f and %.2f is %.2f\n", firstNumber, secondNumber,
                (firstNumber / secondNumber));

        takeInput.close();
    }
}